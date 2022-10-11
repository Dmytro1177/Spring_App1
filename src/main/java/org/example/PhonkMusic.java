package org.example;

import org.springframework.stereotype.Component;

@Component
public class PhonkMusic implements Music{
    @Override
    public String getSong(){
        return "PakMane";
    }
}
