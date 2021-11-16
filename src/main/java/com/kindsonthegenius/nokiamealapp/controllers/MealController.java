package com.kindsonthegenius.nokiamealapp.controllers;
import com.kindsonthegenius.nokiamealapp.models.Meal;
import com.kindsonthegenius.nokiamealapp.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MealController {

    @Autowired
    private MealService mealService;

    //Get all meals
    @GetMapping("/meals")
    public List<Meal> findAll(){
        return mealService.findAll();
    }

    //Get a meal by id
    @GetMapping("/meal/{id}")
    public Meal findById(@PathVariable("id") int id){
        return mealService.findById(id);
    }

    //Save a meal
    @PostMapping("/meals")
    public void save( @RequestBody Meal meal){
        mealService.save(meal);
    }

    //Update a meal
    @PutMapping("/meal/{id}")
    public void save(@PathVariable("id") Integer id, @RequestBody Meal meal){
        mealService.save(meal);
    }

    //Delete a single meal
    @DeleteMapping("/meal/{id}")
    public void delete(@PathVariable("id") int id){
        mealService.delete(id);
    }

}
