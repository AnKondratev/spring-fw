package ru.kondratev.stud;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Initialization..");
    }

    public void doMyDestroy() {
        System.out.println("Destruction..");
    }

    @Override
    public String getSong() {
        return "Classic song..";
    }
}
