package dev.skiff.archnemesisapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Modifiers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "modifierID")
public class Modifier {
    @Id
    private int modifierID;
    @Column
    private String name;
    @Column
    private String description;
    @JsonIgnoreProperties({"modifiers", "recipeList"})
    @ManyToMany(mappedBy = "modifiers", fetch = FetchType.LAZY)
    private List<Recipe> recipeList = new ArrayList<>();
}
