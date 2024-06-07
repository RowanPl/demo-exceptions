package org.example.demoexceptions.dto.mapper;

import org.example.demoexceptions.dto.input.IngredientInputDto;
import org.example.demoexceptions.dto.output.IngredientOutputDto;
import org.example.demoexceptions.models.Ingredient;

public class IngredientMapper {

    public static Ingredient fromInputDtoToModel(IngredientInputDto ingredientInputDto){
        Ingredient i = new Ingredient();
        i.setAmount(ingredientInputDto.amount);
        i.setName(ingredientInputDto.name);
        i.setUnit(ingredientInputDto.unit);
        i.setCost(ingredientInputDto.cost);
        i.setSellPrice(ingredientInputDto.calculateSellprice());
//        i.setSellPrice(ingredientInputDto.sellPrice);
        return i;
    }

    public static IngredientOutputDto fromModelToOutputDto(Ingredient ingredient){
        IngredientOutputDto ingredientOutputDto = new IngredientOutputDto();
        ingredientOutputDto.setAmount(ingredient.getAmount());
//        ingredientOutputDto.setCost(ingredient.getCost());
        ingredientOutputDto.setUnit(ingredient.getUnit());
        ingredientOutputDto.setName(ingredient.getName());
        ingredientOutputDto.setSellPrice(ingredient.getSellPrice());
        return ingredientOutputDto;
    }







}
