package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PhonkMusic phonkMusic;

    private List<Music> musicList = new ArrayList<>();
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PhonkMusic phonkMusic){
        this.phonkMusic = phonkMusic;
        this.classicalMusic = classicalMusic;
    }
   // public MusicPlayer(){}
    //public void setMusic(Music music){
    //this.music=music;
    //}

    public String playMusic(){
        return " Playing: " + classicalMusic.getSong()+ " Playing: " + phonkMusic.getSong();

    }
}
