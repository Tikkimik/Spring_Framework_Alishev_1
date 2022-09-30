package ru.kalyanov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("choose a genre: \n" +
                    "1). Rock \n" +
                    "2). Classic \n" +
                    "3). Jazz. ");
            int userChoice = scanner.nextInt();
            if(userChoice < 0 || userChoice > 3){
                System.out.println("wrong number, try again");
            } else {
                switch (userChoice) {
                    case 1:
                        return "Computer: id=" + id + " " + musicPlayer.playMusic(Genre.Rock);
                    case 2:
                        return "Computer: id=" + id + " " + musicPlayer.playMusic(Genre.Classic);
                    case 3:
                        return "Computer: id=" + id + " " + musicPlayer.playMusic(Genre.Jazz);
                }
            }
        }
    }
}
