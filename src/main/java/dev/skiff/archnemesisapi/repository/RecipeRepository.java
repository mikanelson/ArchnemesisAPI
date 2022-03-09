package dev.skiff.archnemesisapi.repository;

import dev.skiff.archnemesisapi.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    Recipe save(Recipe recipe);

    @Query("from Recipe")
    List<Recipe> getAllRecipes();

    @Query("from Recipe where name = :name")
    List<Recipe> findAllRecipesByName(String name);

    @Query("from Recipe where recipeid = :id")
    Recipe findRecipeById(int id);

    @Query("from Recipe where description like %:currency%")
    List<Recipe> getAllRecipesByCurrency(String currency);

    @Query(value = "select r.recipeid, r.name, r.description from modifiers m join recipes_modifiers rm on rm.modifierid = m.modifierid join recipes r on rm.recipeid = r.recipeid where m.modifierid = (select modifierid from modifiers where name like %:modifier%)", nativeQuery = true)
    List<Recipe> getAllRecipesByModifier(String modifier);

    @Modifying
    @Query("DELETE from Recipe r where r.recipeID = :id")
    int deleteRecipeById(int id);
}