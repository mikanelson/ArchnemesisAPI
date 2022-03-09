package dev.skiff.archnemesisapi.service;

import dev.skiff.archnemesisapi.model.Modifier;
import dev.skiff.archnemesisapi.repository.ModifierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ModifierService {
    ModifierRepository modifierRepository;

    @Autowired
    public ModifierService(ModifierRepository modifierRepository) {
        this.modifierRepository = modifierRepository;
    }

    public List<Modifier> getAllModifiers() {
        return modifierRepository.getAllModifiers();
    }

    public Modifier saveModifier(Modifier modifier) {
        return modifierRepository.save(modifier);
    }

    public List<Modifier> getAllModifiersByName(String name) {
        return modifierRepository.findAllModifiersByName(name);
    }

    public Modifier getModifierById(int id) {
        return modifierRepository.findModifierById(id);
    }

    public Modifier updateModifier(int id, Modifier updatedModifier) {
        Modifier modifier = modifierRepository.findModifierById(id);
        if (modifier != null) {
            return modifierRepository.save(updatedModifier);
        }
        return null;
    }

    public List<Modifier> getAllModifiersByCurrency(String currency) {
        return modifierRepository.getAllModifiersByCurrency(currency);
    }

    public int deleteModifierById(int id) {
        return modifierRepository.deleteModifierById(id);
    }
}
