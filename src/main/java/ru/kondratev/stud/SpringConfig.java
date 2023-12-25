package ru.kondratev.stud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.kondratev.stud.genres.ClassicalMusic;
import ru.kondratev.stud.genres.RapMusic;
import ru.kondratev.stud.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.kondratev.stud")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> myList() {
        return Arrays.asList(classicalMusic(), rapMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(myList());
    }
}
