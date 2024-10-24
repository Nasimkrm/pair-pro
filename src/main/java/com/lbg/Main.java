package com.lbg;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Dish spaghettiBolognese = new Dish();
            spaghettiBolognese.setName("Spaghetti Bolognese");
            spaghettiBolognese.setCalories(413);
            spaghettiBolognese.setCuisine("Italian");
            spaghettiBolognese.setMealType("Lunch or dinner");
            spaghettiBolognese.setIngredients(new String[]{"Spaghetti", "Minced Beef/Lamb", "Tinned Tomatoes", "Spices", "Herbs"});

        System.out.println(spaghettiBolognese.getName());
        System.out.println(spaghettiBolognese.getCalories());
        System.out.println(spaghettiBolognese.getCuisine());

        System.out.println(spaghettiBolognese.getMealType());
        System.out.println(Arrays.toString(spaghettiBolognese.getIngredients()));


    }
    }
