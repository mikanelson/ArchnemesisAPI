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
    public ModifierController(ModifierService modifierService){
        this.modifierService = modifierService;
    }

    @GetMapping("/modifier")
    public List<Modifier> getAllModifiers(){
        return modifierService.getAllModifiers();
    }

    @PostMapping("/modifier/add")
    public Modifier postModifier(@RequestBody Modifier modifier){
        return modifierService.saveModifier(modifier);
    }

    @GetMapping("/modifier/name/{name}")
    public List<Modifier> getAllModifiersByName(@PathVariable String name){
        return modifierService.getAllModifiersByName(name);
    }


    @GetMapping("/modifier/id/{id}")
    public List<Modifier> getAllModifiersByID(@PathVariable int id){
        return modifierService.getAllModifiersById(id);
    }
}
