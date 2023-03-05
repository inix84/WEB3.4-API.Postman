package me.shulinina.web34.service;
import me.shulinina.web34.model.Recipe;
public interface RecipeService {
    long addRecipe(Recipe recipe);
    long getRecipe(Recipe recipe);
    Recipe getRecipe(long id);
}