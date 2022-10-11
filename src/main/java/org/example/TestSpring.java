package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
/*        Scanner x = new Scanner(System.in);
        System.out.println("Enter type of music: 1-Classical 2-Phonk 3-Rock");
        int c = x.nextInt();*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        musicPlayer.playMusic();*/
/*
        if(c==3) {
            Music music = context.getBean("rockMusic", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);
            musicPlayer.playMusic();
        }
        else if(c==2) {
            Music music = context.getBean("phonkMusic", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);
            musicPlayer.playMusic();
        }
        else {
            Music music = context.getBean("classicalMusic", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);
            musicPlayer.playMusic();
        }

*/

//        System.out.println(classicalMusic.getSong());



//        ClassicalMusic classicalMusic1 = new ClassicalMusic();

       /* MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(15);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
