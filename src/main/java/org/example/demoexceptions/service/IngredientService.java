package org.example.demoexceptions.service;

import org.example.demoexceptions.dto.input.IngredientInputDto;
import org.example.demoexceptions.dto.mapper.IngredientMapper;
import org.example.demoexceptions.dto.output.IngredientOutputDto;
import org.example.demoexceptions.models.Ingredient;
import org.example.demoexceptions.repository.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    public IngredientOutputDto createIngredient(IngredientInputDto ingredientInputDto) {
        Ingredient i = ingredientRepository.save(IngredientMapper.fromInputDtoToModel(ingredientInputDto));
        return IngredientMapper.fromModelToOutputDto(i);
    }
}
