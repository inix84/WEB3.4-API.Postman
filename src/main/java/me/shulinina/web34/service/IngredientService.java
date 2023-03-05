package me.shulinina.web34.service;
import me.shulinina.web34.model.Ingredient;

public interface IngredientService {
    long addIngredient(Ingredient ingredient);

    long getIngredient(Ingredient ingredient);

    Ingredient getIngredient(long id);
}