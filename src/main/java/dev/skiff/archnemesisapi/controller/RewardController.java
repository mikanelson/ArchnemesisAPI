package dev.skiff.archnemesisapi.controller;

import dev.skiff.archnemesisapi.model.Recipe;
import dev.skiff.archnemesisapi.model.Reward;
import dev.skiff.archnemesisapi.service.RecipeService;
import dev.skiff.archnemesisapi.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RewardController {
    RewardService rewardService;

    @Autowired
    public RewardController(RewardService rewardService){
        this.rewardService = rewardService;
    }

    @GetMapping("/reward")
    public List<Reward> getAllRewards(){
        return rewardService.getAllRewards();
    }

    @PostMapping("/reward/add")
    public Reward postReward(@RequestBody Reward reward){
        return rewardService.saveReward(reward);
    }

    @GetMapping("/reward/{name}")
    public List<Reward> getAllRewardsByName(@PathVariable String name){
        return rewardService.getAllRewardsByName(name);
    }

}
