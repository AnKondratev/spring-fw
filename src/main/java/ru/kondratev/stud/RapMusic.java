package ru.kondratev.stud;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap song..";
    }
}
