package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
/*        Scanner x = new Scanner(System.in);
        System.out.println("Enter type of music: 1-Classical 2-Phonk 3-Rock");
        int c = x.nextInt();*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.PHONK);*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic);
        System.out.println(rockMusic1);

        context.close();
    }
}
