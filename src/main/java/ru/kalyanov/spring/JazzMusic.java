package ru.kalyanov.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class JazzMusic implements Music {
    private final String[] jazzSongsArray = new String[]{"Lisa Simpson", "h2", "h3"};

    @Override
    public String getSong() {
        Random r = new Random();
        return jazzSongsArray[r.nextInt(jazzSongsArray.length)];
    }
}
