package ru.kalyanov.spring;

public class MusicPlayer {
    private Music music;

    //инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void  playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
