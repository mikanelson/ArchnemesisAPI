package dev.skiff.archnemesisapi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Recipes")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "recipeID")
public class Recipe {
    @Id
    private int recipeID;
    @Column
    private String name;
    @Column
    private String description;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"modifiers", "recipeList"})
    @JoinTable(name = "recipes_modifiers",
            joinColumns = {
                @JoinColumn(name = "recipeid", referencedColumnName = "recipeid", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                @JoinColumn(name = "modifierid", referencedColumnName = "modifierid", nullable = false, updatable = false)
            }
    )
    List<Modifier> modifiers = new ArrayList<Modifier>();
}
