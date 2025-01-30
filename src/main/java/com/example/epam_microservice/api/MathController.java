package com.example.epam_microservice.api;

import com.example.epam_microservice.response.Question;
import com.example.epam_microservice.service.MathService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("api/questions")
@RequiredArgsConstructor
public class MathController {
    private final MathService mathService;

    @GetMapping("{amount}")
    public List<Question> getRandomQuestion(@PathVariable int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> mathService.getRandom())
                .collect(Collectors.toList());
    }
}