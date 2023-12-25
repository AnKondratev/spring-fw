package ru.kondratev.stud;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private final List<Music> list;

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + list.get(random.nextInt(list.size())).getSong();
    }
}
