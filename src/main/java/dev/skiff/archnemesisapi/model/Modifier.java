package dev.skiff.archnemesisapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Modifiers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Modifier {
    @Id
    private int modifierID;
    @Column
    private String name;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "firstReward", referencedColumnName="rewardid")
    private Reward rewardOne;
    @ManyToOne
    @JoinColumn(name = "secondReward", referencedColumnName="rewardid")
    private Reward rewardTwo;
}
