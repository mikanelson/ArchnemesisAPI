package dev.skiff.archnemesisapi.service;

import dev.skiff.archnemesisapi.model.Modifier;
import dev.skiff.archnemesisapi.repository.ModifierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ModifierService {
    ModifierRepository modifierRepository;

    @Autowired
    public ModifierService(ModifierRepository modifierRepository){
        this.modifierRepository = modifierRepository;
    }

    public List<Modifier> getAllModifiers() {
        return modifierRepository.getAllModifiers();
    }

    public Modifier saveModifier(Modifier modifier){
        return modifierRepository.save(modifier);
    }

    public List<Modifier> getAllModifiersByName(String name) {
        return modifierRepository.findAllModifiersByName(name);
    }
}
