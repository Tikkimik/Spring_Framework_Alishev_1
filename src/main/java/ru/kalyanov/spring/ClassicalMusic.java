package ru.kalyanov.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
