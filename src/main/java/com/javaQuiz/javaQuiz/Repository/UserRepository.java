package com.javaQuiz.javaQuiz.Repository;

import com.javaQuiz.javaQuiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Email ke dwara user ke saare quiz attempts dhoondne ke liye
    List<User> findByEmail(String email);
}