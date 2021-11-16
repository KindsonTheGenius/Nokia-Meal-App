package com.kindsonthegenius.nokiamealapp.services;

import com.kindsonthegenius.nokiamealapp.models.Meal;
import com.kindsonthegenius.nokiamealapp.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealRepository repository;

    //Get All
    public List<Meal> findAll(){
        return repository.findAll();
    }

    //Get by Id
    public Meal findById(int id){
        return repository.findById(id).orElse(null);
    }

    //Post new meal
    public void save(Meal meal){
        repository.save(meal);
    }

    //Delete Meal
    public void delete(int id){
        repository.deleteById(id);
    }

}
