package dev.skiff.archnemesisapi.controller;

import dev.skiff.archnemesisapi.model.Modifier;
import dev.skiff.archnemesisapi.service.ModifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModifierController {
    ModifierService modifierService;

    @Autowired
    public ModifierController(ModifierService modifierService) {
        this.modifierService = modifierService;
    }

    @GetMapping("/modifier")
    public List<Modifier> getAllModifiers() {
        return modifierService.getAllModifiers();
    }

    @PostMapping("/modifier/add")
    public Modifier postModifier(@RequestBody Modifier modifier) {
        return modifierService.saveModifier(modifier);
    }

    @GetMapping("/modifier/name/{name}")
    public List<Modifier> getAllModifiersByName(@PathVariable String name) {
        return modifierService.getAllModifiersByName(name);
    }

    @GetMapping("/modifier/id/{id}")
    public Modifier getModifierById(@PathVariable int id) {
        return modifierService.getModifierById(id);
    }

    @GetMapping("/modifier/currency/{currency}")
    public List<Modifier> getAllModifiersByCurrency(@PathVariable String currency) {
        return modifierService.getAllModifiersByCurrency(currency);
    }

    @DeleteMapping("/modifier/delete/id/{id}")
    public int deleteModifierById(@PathVariable int id) {
        return modifierService.deleteModifierById(id);
    }

    @PutMapping("/modifier/update/id/{id}")
    public Modifier updateModifierById(@PathVariable int id, @RequestBody Modifier modifier) {
        return modifierService.updateModifier(id, modifier);
    }
}
