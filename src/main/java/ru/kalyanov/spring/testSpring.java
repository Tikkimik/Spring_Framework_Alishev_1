package ru.kalyanov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();

//        Music music = context.getBean("rockMusic", RockMusic.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();

//        Music music1 = context.getBean("jazzMusic", JazzMusic.class);
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//        musicPlayer1.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();


    }
}
