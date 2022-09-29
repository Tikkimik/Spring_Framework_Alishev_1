package ru.kalyanov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music1 = context.getBean("jazzMusic", JazzMusic.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(music1);

        musicPlayer1.playMusic();

        context.close();


    }
}
