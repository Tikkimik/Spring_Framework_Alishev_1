package ru.kalyanov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;

    Scanner scanner = new Scanner(System.in);

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(Genre gengre) {
        if (gengre == ){

        }
        return "Playing: " + music1.getSong() + ", " + music2.getSong() + ", " +  music3.getSong();
    }
}