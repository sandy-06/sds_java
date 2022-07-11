package com.example.M2ChallengeSandersSandra.contoller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {


    public int operation(int operand1, int operand2, String operation) {
        int answer = 0;
        switch (operation) {
            case "add":
                answer = operand1 + operand2;
                break;
            case "subtract":
                answer = operand1 - operand2;
                break;
            case "multiply":
                answer = operand1 * operand2;
                break;
            case "divide":
                answer = operand1 / operand2;
                break;
        }
        return answer;
    }
}







    

