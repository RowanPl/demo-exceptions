package org.example.demoexceptions.dto.output;

public class IngredientOutputDto {

    private String name;
    private Integer amount;
    private String unit;
//    private Integer cost;
    private Integer sellPrice;

    public Integer getSellPrice() {
        return sellPrice;
    }



    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }



//    public Integer getCost() {
//        return cost;
//    }
//
//    public void setCost(Integer cost) {
//        this.cost = cost;
//    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
