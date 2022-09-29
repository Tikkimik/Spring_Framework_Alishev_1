package ru.kalyanov.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    private final String[] rockSongsArray = new String[]{"Wind cries Mery", "rock2", "rock3"};


    @Override
    public String getSong() {
        Random r = new Random();
        return rockSongsArray[r.nextInt(rockSongsArray.length)];
    }
}
