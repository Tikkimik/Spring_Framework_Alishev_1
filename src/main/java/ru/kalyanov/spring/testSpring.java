package ru.kalyanov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //сравнение по указателям
        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        //musicPlayer.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
