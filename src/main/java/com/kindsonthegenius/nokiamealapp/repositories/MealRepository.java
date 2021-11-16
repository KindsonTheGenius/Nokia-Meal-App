package com.kindsonthegenius.nokiamealapp.repositories;

import com.kindsonthegenius.nokiamealapp.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {

}
