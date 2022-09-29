package ru.kalyanov.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private final String[] classicSongsArray = new String[]{"Hungarian Rhapsody", "classic2", "classic3"};

    @Override
    public String getSong() {
        Random r = new Random();
        return classicSongsArray[r.nextInt(classicSongsArray.length)];
    }
}
