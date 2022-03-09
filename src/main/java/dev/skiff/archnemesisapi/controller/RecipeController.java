package dev.skiff.archnemesisapi.controller;

import dev.skiff.archnemesisapi.model.Recipe;
import dev.skiff.archnemesisapi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipe")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @PostMapping("/recipe/add")
    public Recipe postRecipe(@RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

    @GetMapping("/recipe/name/{name}")
    public List<Recipe> getAllRecipesByName(@PathVariable String name) {
        return recipeService.getAllRecipesByName(name);
    }

    @GetMapping("/recipe/id/{id}")
    public Recipe getRecipeById(@PathVariable int id) {
        return recipeService.getRecipeById(id);
    }

    @GetMapping("recipe/currency/{currency}")
    public List<Recipe> getAllRecipesByCurrency(@PathVariable String currency) {
        return recipeService.getAllRecipesByCurrency(currency);
    }

    @GetMapping("recipe/modifier/{modifier}")
    public List<Recipe> getAllRecipesByModifier(@PathVariable String modifier) {
        return recipeService.getAllRecipesByModifier(modifier);
    }

    @DeleteMapping("recipe/delete/id/{id}")
    public int deleteRecipeById(@PathVariable int id) {
        return recipeService.deleteRecipeById(id);
    }

    @PutMapping("recipe/update/id/{id}")
    public Recipe updateRecipeById(@PathVariable int id, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(id, recipe);
    }
}
