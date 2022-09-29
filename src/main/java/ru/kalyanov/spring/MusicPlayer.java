package ru.kalyanov.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    Music music;


    //инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void  playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}