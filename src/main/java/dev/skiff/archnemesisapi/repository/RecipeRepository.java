package dev.skiff.archnemesisapi.repository;

import dev.skiff.archnemesisapi.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    Recipe save(Recipe recipe);

    @Query("from Recipe")
    List<Recipe> getAllRecipes();

    @Query("from Recipe where name = :name")
    List<Recipe> findAllRecipesByName(String name);
}