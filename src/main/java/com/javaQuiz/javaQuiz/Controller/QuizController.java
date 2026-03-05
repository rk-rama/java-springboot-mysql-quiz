package com.javaQuiz.javaQuiz.Controller;

import com.javaQuiz.javaQuiz.Repository.UserRepository;
import com.javaQuiz.javaQuiz.Service.QuizService;
import com.javaQuiz.javaQuiz.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class QuizController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuizService quizService;

    @GetMapping("/")
    public String registrationPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/startQuiz")
    public String startQuiz(@ModelAttribute User user, HttpSession session) {
        User savedUser = userRepository.save(user);
        session.setAttribute("currentUser", savedUser);
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String showDashboard(HttpSession session, Model model) {
        User user = (User) session.getAttribute("currentUser");
        if (user == null) return "redirect:/";
        model.addAttribute("userName", user.getName());
        return "dashboard";
    }

    @GetMapping("/quiz/{category}")
    public String showQuiz(@PathVariable String category, HttpSession session, Model model) {
        User user = (User) session.getAttribute("currentUser");
        if (user == null) return "redirect:/";

        // Update category in session user object
        user.setSelectedCategory(category);

        List<String[]> questions = quizService.getQuestionsByCategory(category);
        model.addAttribute("questions", questions);
        model.addAttribute("category", category);

        return "quiz-page";
    }

    @PostMapping("/submitQuiz")
    public String submitQuiz(HttpServletRequest request, HttpSession session, Model model) {
        User user = (User) session.getAttribute("currentUser");
        if (user == null) return "redirect:/";

        String category = user.getSelectedCategory();
        List<String[]> questions = quizService.getQuestionsByCategory(category);

        int finalScore = 0;
        if (questions != null) {
            for (int i = 0; i < questions.size(); i++) {
                String submittedAns = request.getParameter("q" + i);
                String correctAns = questions.get(i)[5];
                if (submittedAns != null && submittedAns.equals(correctAns)) {
                    finalScore++;
                }
            }
        }

        user.setScore(finalScore);
        userRepository.save(user); // Database mein score update karein

        model.addAttribute("score", finalScore);
        model.addAttribute("userName", user.getName());
        model.addAttribute("category", category);
        return "result";
    }
}