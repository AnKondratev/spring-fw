package ru.kondratev.stud;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        Random random = new Random();
      List<String> list = List.of(
                "Classic song_1",
                "Classic song_2",
                "Classic song_3"
        );
        return list.get(random.nextInt(list.size()));
    }
}
