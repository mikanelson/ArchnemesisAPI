package dev.skiff.archnemesisapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @ManyToOne
    @JoinColumn(name = "firstIng", referencedColumnName="modifierid")
    private Modifier firstIng;
    @ManyToOne
    @JoinColumn(name = "secondIng", referencedColumnName="modifierid")
    private Modifier secondIng;
    @ManyToOne
    @JoinColumn(name = "thirdIng", referencedColumnName="modifierid")
    private Modifier thirdIng;
    @ManyToOne
    @JoinColumn(name = "fourthIng", referencedColumnName="modifierid")
    private Modifier fourthIng;
    @ManyToOne
    @JoinColumn(name = "firstReward", referencedColumnName="rewardid")
    private Reward rewardOne;
    @ManyToOne
    @JoinColumn(name = "secondReward", referencedColumnName="rewardid")
    private Reward rewardTwo;
    @ManyToOne
    @JoinColumn(name = "thirdReward", referencedColumnName="rewardid")
    private Reward rewardThree;
    @ManyToOne
    @JoinColumn(name = "fourthReward", referencedColumnName="rewardid")
    private Reward rewardFour;
}
