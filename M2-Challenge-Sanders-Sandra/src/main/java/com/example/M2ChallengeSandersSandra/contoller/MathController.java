package com.example.M2ChallengeSandersSandra.contoller;

import com.example.M2ChallengeSandersSandra.models.MathSolution;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @PostMapping("/add")
    public MathSolution add(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("add");
        mathSolution.setAnswer();
        return mathSolution;


    }

    @PostMapping("/subtract")
    public MathSolution subtract(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("subtract");
        mathSolution.setAnswer();
        return mathSolution;
    }
    @PostMapping("/multiply")
    public MathSolution multiply(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("multiply");
        mathSolution.setAnswer();
        return mathSolution;
    }
    @PostMapping("/divide")
    public MathSolution divide(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("divide");
        mathSolution.setAnswer();
        return mathSolution;
    }

}



    

