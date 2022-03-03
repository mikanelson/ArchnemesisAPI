package dev.skiff.archnemesisapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recipes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recipe {
    @Id
    private int recipeID;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String firstIng;
    @Column
    private String secondIng;
    @Column
    private String thirdIng;
    @Column
    private String fourthIng;
    @Column
    private String rewardOne;
    @Column
    private String rewardTwo;
    @Column
    private String rewardThree;
    @Column
    private String rewardFour;
}
