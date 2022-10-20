package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PhonkMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Pakmane");
        songs.add("Stilov");
        songs.add("Meet`s of maker");
    }
    @Override
    public List<String> getSong(){
        return songs;
    }
}
