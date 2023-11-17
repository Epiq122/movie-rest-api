package ca.robertgleason.movie.controller;


import ca.robertgleason.movie.models.Movie;
import ca.robertgleason.movie.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
public class MovieController {

    private final MovieService movieService;


    @GetMapping("/api/v1/movies")
    public List<Movie> listMovies() {
        log.debug("List Movies - in controller");

        return movieService.listMovies();
    }

    public Movie getMovieById(UUID id) {
        log.debug("Get Movie by Id - in controller");

        return movieService.getMovieById(id);

    }

}
