package ru.kondratev.stud;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my init..");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my dest..");
    }
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
