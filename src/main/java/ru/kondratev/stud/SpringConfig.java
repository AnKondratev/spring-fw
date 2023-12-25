package ru.kondratev.stud;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.kondratev.stud")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
