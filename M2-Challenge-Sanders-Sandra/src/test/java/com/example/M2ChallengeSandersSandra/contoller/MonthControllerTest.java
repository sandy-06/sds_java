package com.example.M2ChallengeSandersSandra.contoller;


import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.example.M2ChallengeSandersSandra.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    


    @Test
    public void shouldReturnAMonthByMonthNumber() throws Exception {
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setNumber(1);
        outputMonth.setName("January");

        String outputJson = mapper.writeValueAsString(outputMonth);
        mockMvc.perform(get("/month/{monthNumber}", 1))
                .andDo(print())
                .andExpect(status().isOk())
                    .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnAMonthByMonthName() throws Exception {
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setName("January");

    }


    @Test
    public void shouldGetRandomMonth() throws Exception {
        //Arrange
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").isNotEmpty())       // Assert
                .andExpect(jsonPath("$.name").isNotEmpty())       // Assert
                .andExpect(jsonPath("$.number").isNumber())       // Assert
                .andExpect(jsonPath("$.name").isString());       // Assert
    }

}



