package com.javaQuiz.javaQuiz.Repository;

 // Aapka package name yahan aayega
import com.javaQuiz.javaQuiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository ki wajah se save(), findAll(), findById() jaise methods
    // aapko free mein mil jayenge.
}