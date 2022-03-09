package dev.skiff.archnemesisapi.service;

import dev.skiff.archnemesisapi.model.Recipe;
import dev.skiff.archnemesisapi.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class RecipeService {
    RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipesByName(String name) {
        return recipeRepository.findAllRecipesByName(name);
    }

    public Recipe getRecipeById(int id) {
        return recipeRepository.findRecipeById(id);
    }

    public Recipe updateRecipe(int id, Recipe updatedRecipe) {
        Recipe recipe = recipeRepository.findRecipeById(id);
        if (recipe != null) {
            return recipeRepository.save(updatedRecipe);
        }
        return null;
    }

    public List<Recipe> getAllRecipesByCurrency(String currency) {
        return recipeRepository.getAllRecipesByCurrency(currency);
    }

    public List<Recipe> getAllRecipesByModifier(String modifier) {
        return recipeRepository.getAllRecipesByModifier(modifier);
    }

    public int deleteRecipeById(int id) {
        return recipeRepository.deleteRecipeById(id);
    }
}
