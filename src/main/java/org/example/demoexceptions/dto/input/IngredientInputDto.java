package org.example.demoexceptions.dto.input;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class IngredientInputDto {

    @NotEmpty
    public String name;
    @Positive
    public Integer amount;

    public String unit;
    @Max(10)
    public Integer cost;
//    @Positive
//    public Integer sellPrice;


    public int calculateSellprice(){
       return cost * 4;
    }

}
