package ru.kondratev.stud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicalTypes rock = MusicalTypes.ROCK;
    private MusicalTypes classical = MusicalTypes.CLASSICAL;
    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return
                "Computer: " + id +
                ", musicPlayer: " + musicPlayer.playMusic(rock);
    }
}
