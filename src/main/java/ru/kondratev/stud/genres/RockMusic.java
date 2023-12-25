package ru.kondratev.stud.genres;

import org.springframework.stereotype.Component;
import ru.kondratev.stud.Music;

import java.util.List;
import java.util.Random;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        Random random = new Random();
        List<String> rockList = List.of(
                "Rock song_1",
                "Rock song_2",
                "Rock song_3"
        );
        return rockList.get(random.nextInt(rockList.size()));
    }
}
