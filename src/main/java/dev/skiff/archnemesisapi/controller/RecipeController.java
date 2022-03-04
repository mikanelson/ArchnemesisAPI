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
    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping("/recipe")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    @PostMapping("/recipe/add")
    public Recipe postRecipe(@RequestBody Recipe recipe){
        return recipeService.saveRecipe(recipe);
    }

    @GetMapping("/recipe/{name}")
    public List<Recipe> getAllRecipesByName(@PathVariable String name){
        return recipeService.getAllRecipesByName(name);
    }

}
