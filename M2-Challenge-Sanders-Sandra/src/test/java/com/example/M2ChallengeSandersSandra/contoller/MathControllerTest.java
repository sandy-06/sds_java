package com.example.M2ChallengeSandersSandra.contoller;

import com.example.M2ChallengeSandersSandra.models.MathSolution;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. We don't have to do anything special for mockMvc since it's Autowired. We will however be using
        // setUp() in the future.
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() throws Exception {
        MathSolution mathSolution = new MathSolution();

        mathSolution.setOperand1(6);
        mathSolution.setOperand2(3);
        String inputJson = mapper.writeValueAsString(mathSolution);

        MathSolution output = new MathSolution(6, 3, 9, "add");
        String outputString = mapper.writeValueAsString(output);
        this.mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }


    @Test
    public void shouldReturnDifferenceOfTwoNumbers() throws Exception {
        MathSolution mathSolution = new MathSolution();

        mathSolution.setOperand1(6);
        mathSolution.setOperand2(3);
        String inputString = mapper.writeValueAsString(mathSolution);

        MathSolution output = new MathSolution(6, 3, 3, "subtract");
        String outputString = mapper.writeValueAsString(output);
        this.mockMvc.perform(post("/subtract")
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }

    @Test
    public void shouldReturnProductOfTwoNumbers() throws Exception {
        MathSolution mathSolution = new MathSolution();

        mathSolution.setOperand1(6);
        mathSolution.setOperand2(3);
        String inputString = mapper.writeValueAsString(mathSolution);

        MathSolution output = new MathSolution(6, 3, 18, "multiply");
        String outputString = mapper.writeValueAsString(output);
        this.mockMvc.perform(post("/multiply")
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }


    @Test
    public void shouldReturnDivisionOfTwoNumbers() throws Exception {
        MathSolution mathSolution = new MathSolution();

        mathSolution.setOperand1(6);
        mathSolution.setOperand2(3);
        String inputString = mapper.writeValueAsString(mathSolution);

        MathSolution output = new MathSolution(6, 3, 2, "divide");
        String outputString = mapper.writeValueAsString(output);
        this.mockMvc.perform(post("/divide", new Object[]{})
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }
}


