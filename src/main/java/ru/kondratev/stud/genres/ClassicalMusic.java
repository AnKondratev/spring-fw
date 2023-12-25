package ru.kondratev.stud.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.kondratev.stud.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

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
