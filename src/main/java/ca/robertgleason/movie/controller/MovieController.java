package ca.robertgleason.movie.controller;


import ca.robertgleason.movie.models.Movie;
import ca.robertgleason.movie.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@AllArgsConstructor
@Slf4j
public class MovieController {

    private final MovieService movieService;

    public Movie getMovieById(UUID id) {
        log.debug("Get Movie by Id - in controller");

        return movieService.getMovieById(id);

    }

}
