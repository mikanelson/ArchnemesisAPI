package dev.skiff.archnemesisapi;

import dev.skiff.archnemesisapi.model.Modifier;
import dev.skiff.archnemesisapi.model.Recipe;
import dev.skiff.archnemesisapi.model.Reward;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = {Recipe.class, Modifier.class, Reward.class})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
