package ca.robertgleason.movie.controller;


import ca.robertgleason.movie.models.Movie;
import ca.robertgleason.movie.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/movies/")
public class MovieController {

    private final MovieService movieService;


    @GetMapping()
    public List<Movie> listMovies() {
        log.debug("List Movies - in controller");

        return movieService.listMovies();
    }


    @GetMapping("{movieId}")
    public Movie getMovieById(@PathVariable("movieId") UUID movieId) {
        log.debug("Get Movie by Id - in controller");

        return movieService.getMovieById(movieId);

    }

}
