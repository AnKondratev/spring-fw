package ru.kondratev.stud;

import java.util.List;

public class MusicPlayer {
    private Music song;
    private List<Music> playlist;
    private String name;
    private int value;

    public MusicPlayer(Music song) {
        this.song = song;
    }

    public MusicPlayer() {

    }

    public Music getSong() {
        return song;
    }

    public void setSong(Music song) {
        this.song = song;
    }

    public List<Music> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Music> playlist) {
        this.playlist = playlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void playMusic() {
        System.out.printf("Playing: %s%n", song.getSong());
    }

    public void playMusicList() {
        getPlaylist().forEach(e -> System.out.println(e.getSong()));
    }
}
