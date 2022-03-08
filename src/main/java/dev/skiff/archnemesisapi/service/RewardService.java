package dev.skiff.archnemesisapi.service;

import dev.skiff.archnemesisapi.model.Recipe;
import dev.skiff.archnemesisapi.model.Reward;
import dev.skiff.archnemesisapi.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RewardService {
    RewardRepository rewardRepository;

    @Autowired
    public RewardService(RewardRepository rewardRepository){
        this.rewardRepository = rewardRepository;
    }

    public List<Reward> getAllRewards() {
        return rewardRepository.getAllRewards();
    }

    public Reward saveReward(Reward reward){
        return rewardRepository.save(reward);
    }

    public List<Reward> getAllRewardsByName(String name) {
        return rewardRepository.findAllRewardsByName(name);
    }

    public List<Reward> getAllRewardsById(int id) {
        return rewardRepository.findAllRewardsById(id);
    }
}