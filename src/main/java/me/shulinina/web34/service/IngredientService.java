package me.shulinina.web34.service;
import me.shulinina.web34.model.Ingredient;
public interface IngredientService {
    long addIngredient(Ingredient ingredient);
    Ingredient getIngredient(long id);
    Ingredient getAllIngredient();
    Ingredient editIngredient(long id, Ingredient ingredient);
    boolean deleteIngredient(long id);
    void deleteAllIngredient();
}