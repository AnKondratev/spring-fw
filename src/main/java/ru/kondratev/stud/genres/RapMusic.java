package ru.kondratev.stud.genres;

import org.springframework.stereotype.Component;
import ru.kondratev.stud.Music;


public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap song..";
    }
}
