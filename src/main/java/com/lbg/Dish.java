package com.lbg;

public class Dish {

    private String name;
    private String cuisine;
    private String mealType;
    private int calories;
    private String[] ingredients;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }


}
