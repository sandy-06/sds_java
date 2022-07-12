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

    @Before


    @Test
    public void shouldReturnAMonthByMonthNumber() throws Exception {
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setMonthNumber(1);
        @Valid
        @Min(1) @Max(12) int monthNumber = 1;

        mockMvc.perform(get("/month/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(mapper.writeValueAsString(outputMonth)));
    }

    @Test
    public void shouldReturnAMonthByMonthName() throws Exception {
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setMonthName("January");

    }


    @Test
    public void shouldGetRandomMonth() throws Exception {
        //Arrange
        mockMvc.perform(get("/month/random"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"monthNumber\":1,\"monthName\":\"January\"}"));
    }

}



