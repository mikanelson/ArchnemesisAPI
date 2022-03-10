package dev.skiff.archnemesisapi.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

public class Aspect {
    Logger logger = Logger.getLogger(Aspect.class);

    @Before("execution(* dev.skiff.archnemesisapi.repository.*(..))")
    public void BeforeRepository(JoinPoint joinPoint){
        logger.info("Repository Method Called:");
        logger.info(joinPoint.getSignature());
        logger.info(Arrays.toString(joinPoint.getArgs()));
    }
}
