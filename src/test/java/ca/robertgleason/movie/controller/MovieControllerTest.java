package ca.robertgleason.movie.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class MovieControllerTest {

    @Autowired
    MovieController movieController;


    @Test
    void getMovieById() {
        System.out.println(movieController.getMovieById(UUID.randomUUID()));
    }
}
