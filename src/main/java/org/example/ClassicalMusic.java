package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
  /*  private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
*/
    private List<String> songs = new ArrayList<>();
    {
    songs.add("Hungarian Rhapsody");
    songs.add("Symphony no. 5 in C Minor, op. 67");
    songs.add("Night on Bald Mountain");
    }
    @Override
    public List<String> getSong(){
        return songs;
    }
}
