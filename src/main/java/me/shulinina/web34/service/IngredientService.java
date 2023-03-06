package me.shulinina.web34.service;
import me.shulinina.web34.model.Ingredient;

import java.util.Collection;

public interface IngredientService {
    long addIngredient(Ingredient ingredient);
    Ingredient getIngredient(long id);
    Ingredient getAllIngredient();

    //    public Ingredient getAllIngredient() {
//        return (Ingredient) ingredients;
//    }
    Collection<Ingredient> getAll();

    Ingredient editIngredient(long id, Ingredient ingredient);
    boolean deleteIngredient(long id);
    void deleteAllIngredient();
}