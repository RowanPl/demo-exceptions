package org.example.demoexceptions.repository;

import org.example.demoexceptions.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
