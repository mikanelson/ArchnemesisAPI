package dev.skiff.archnemesisapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    @Column
    private String rewardOne;
    @Column
    private String rewardTwo;
}
