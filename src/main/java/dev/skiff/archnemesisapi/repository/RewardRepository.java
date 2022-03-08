package dev.skiff.archnemesisapi.repository;

import dev.skiff.archnemesisapi.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RewardRepository extends JpaRepository<Reward, Integer> {
    Reward save(Reward reward);

    @Query("from Reward")
    List<Reward> getAllRewards();

    @Query("from Reward where name = :name")
    List<Reward> findAllRewardsByName(String name);

    @Query("from Reward where rewardid = :id")
    List<Reward> findAllRewardsById(int id);
}