package dev.skiff.archnemesisapi.repository;

import dev.skiff.archnemesisapi.model.Modifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModifierRepository extends JpaRepository<Modifier, Integer> {
    Modifier save(Modifier modifier);

    @Query("from Modifier")
    List<Modifier> getAllModifiers();

    @Query("from Modifier where name = :name")
    List<Modifier> findAllModifiersByName(String name);

    @Query("from Modifier where modifierid = :id")
    Modifier findModifierById(int id);

    @Query("from Modifier where description like %:currency%")
    List<Modifier> getAllModifiersByCurrency(String currency);

    @Modifying
    @Query("DELETE from Modifier m where m.modifierID = :id")
    int deleteModifierById(int id);
}