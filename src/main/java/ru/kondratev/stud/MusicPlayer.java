package ru.kondratev.stud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.value}")
    private int value;
    private Music rock;
    private Music classic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rock,
                       @Qualifier("classicalMusic") Music classic) {
        this.rock = rock;
        this.classic = classic;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String playMusic(MusicalTypes type) {
        String res = switch (type) {
            case ROCK -> rock.getSong();
            case CLASSICAL -> classic.getSong();
        };
        return "Playing: " + res;
    }
}
