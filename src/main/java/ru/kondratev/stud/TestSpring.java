package ru.kondratev.stud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer == musicPlayer2);
        musicPlayer.setValue(236);
        System.out.println(musicPlayer.getValue());
        System.out.println(musicPlayer2.getValue());
        List<Music> playListMus = List.of(
                context.getBean("classicMusicBean", ClassicalMusic.class),
                context.getBean("rapMusicBean", RapMusic.class),
                context.getBean("rockMusicBean", RockMusic.class)
        );
        musicPlayer.playMusic();
        System.out.println();
        System.out.println("Playing songs list: ");
        musicPlayer.playMusicList(playListMus);
        System.out.println();

        context.close();
    }
}
