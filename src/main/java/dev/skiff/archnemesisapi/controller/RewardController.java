package dev.skiff.archnemesisapi.controller;

import dev.skiff.archnemesisapi.model.Reward;
import dev.skiff.archnemesisapi.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RewardController {
    RewardService rewardService;

    @Autowired
    public RewardController(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    @GetMapping("/reward")
    public List<Reward> getAllRewards() {
        return rewardService.getAllRewards();
    }

    @PostMapping("/reward/add")
    public Reward postReward(@RequestBody Reward reward) {
        return rewardService.saveReward(reward);
    }

    @GetMapping("/reward/name/{name}")
    public List<Reward> getAllRewardsByName(@PathVariable String name) {
        return rewardService.getAllRewardsByName(name);
    }

    @GetMapping("/reward/id/{id}")
    public Reward getRewardById(@PathVariable int id) {
        return rewardService.getRewardById(id);
    }

    @PutMapping("/reward/update/{id}")
    public Reward updateReward(@PathVariable int id, @RequestBody Reward reward) {
        return rewardService.updateReward(id, reward);
    }
}
