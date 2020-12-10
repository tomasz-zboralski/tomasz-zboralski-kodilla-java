package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        public static final String SESAME_BUN = "SESAME_BUN";
        public static final String STANDARD_BUN = "STANDARD_BUN";
        private ArrayList<String> sauceList = new ArrayList<String>(
                Arrays.asList("standard",
                        "1000 islands",
                        "barbecue"));
        private ArrayList<String> ingredientsList = new ArrayList<String>(
                Arrays.asList("lettuce", "onion", "bacon", "cucumber",
                        "chilli peppers", "mushrooms", "prawns", "cheese"));


        private String bun;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(SESAME_BUN) || bun.equals(STANDARD_BUN)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun must be \"SESAME_BUN\" or \"STANDARD_BUN\"");
            }

            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauceList.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sauce must be one of following: " + sauceList.toString());
            }
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            if (ingredientsList.contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Ingredient must be one of following: " + ingredientsList.toString());
            }

            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
