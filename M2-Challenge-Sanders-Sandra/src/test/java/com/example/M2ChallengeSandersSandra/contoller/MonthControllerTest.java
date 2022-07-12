package com.example.M2ChallengeSandersSandra.contoller;

import com.example.M2ChallengeSandersSandra.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.junit.jupiter.api.Assertions.*;

class MonthControllerTest {
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
    public void shouldReturnAMonthByMonthNumber() throws Exception{
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setMonthNumber(1);

    }
    public void shouldReturnAMonthByMonthName() throws Exception{
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setMonthName("January");

    }
    public void shouldReturnRandomMonth() throws Exception{
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setMonthNumber(1);
        outputMonth.setMonthName("January");

    }

    @Test
    void getMonth() {
    }

    @Test
    void getRandomMonth() {
    }



}