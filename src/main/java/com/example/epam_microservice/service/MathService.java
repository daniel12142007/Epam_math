package com.example.epam_microservice.service;

import com.example.epam_microservice.response.Question;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MathService {
    private final Random random = new Random();

    public Question getRandom() {
        int max = 10;
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Question.builder()
                .question(a + " + " + b + " = ?")
                .answer(String.valueOf(a + b)).build();
    }
}