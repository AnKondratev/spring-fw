package ru.kondratev.stud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
    }
}
