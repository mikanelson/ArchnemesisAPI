package dev.skiff.archnemesisapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rewards")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reward {
    @Id
    private int rewardID;
    @Column
    private String name;
}
