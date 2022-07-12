package com.example.M2ChallengeSandersSandra.contoller;

import com.example.M2ChallengeSandersSandra.models.MathSolution;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MathController {

    @PostMapping("/add")
    public MathSolution add(@Valid @RequestBody MathSolution input) {
        if ((input.getOperand1() == 0 || input.getOperand2() == 0)) {
            throw new IllegalArgumentException("you have to provide an integer for both operands");
        }
        return new MathSolution(input.getOperand1(), input.getOperand2(), input.getOperand1() + input.getOperand2(), "add");
    }
        @PostMapping("/subtract")
        public MathSolution subtract(@Valid @RequestBody MathSolution input) {
            if ((input.getOperand1() == 0 || input.getOperand2() == 0)) {
                throw new IllegalArgumentException("you have to provide an integer for both operands");
            }
            return new MathSolution(input.getOperand1(), input.getOperand2(),  input.getOperand1() - input.getOperand2(), "subtract");
    }
    @PostMapping("/multiply")
    public MathSolution multiply(@Valid @RequestBody MathSolution input) {
            if ((input.getOperand1() == 0 || input.getOperand2() == 0)) {
                throw new IllegalArgumentException("you have to provide an integer for both operands");
            }
            return new MathSolution(input.getOperand1(), input.getOperand2(),  input.getOperand1() * input.getOperand2(), "multiply");

    }
    @PostMapping("/divide")
    public MathSolution divide(@Valid @RequestBody MathSolution input) {
        if ((input.getOperand1() == 0 || input.getOperand2() == 0)) {
            throw new IllegalArgumentException("you have to provide an integer for both operands");
        }
        return new MathSolution(input.getOperand1(), input.getOperand2(), input.getOperand1() / input.getOperand2(), "divide");
    }
}



    

