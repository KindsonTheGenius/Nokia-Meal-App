package com.kindsonthegenius.nokiamealapp.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kindsonthegenius.nokiamealapp.models.Meal;
import com.kindsonthegenius.nokiamealapp.repositories.MealRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MealController.class)
class MealControllerTest {

    //Could not complete adding tests in time!!!
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @MockBean
    MealRepository mealRepository;

    Meal meal1 = new Meal(7,"Soup",56.6,"Pepper", Boolean.TRUE, Boolean.FALSE,"Good food", 45.4, "");
    Meal meal2 = new Meal(8,"Soup",56.6,"Pepper", Boolean.TRUE, Boolean.FALSE,"Good food", 45.4, "");
    Meal meal3 = new Meal(9,"Soup",56.6,"Pepper", Boolean.TRUE, Boolean.FALSE,"Good food", 45.4, "");


//    @Test
//    void findAll_Success() throws Exception {
//        List<Meal> meals = new ArrayList<>(Arrays.asList(meal1, meal2, meal3));
//
//        Mockito.when(mealRepository.findAll()).thenReturn(meals);
//
//        mockMvc.perform(MockMvcRequestBuilders
//        .get("/meals").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
}
