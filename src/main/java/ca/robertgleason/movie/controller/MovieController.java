package ca.robertgleason.movie.controller;


import ca.robertgleason.movie.models.Movie;
import ca.robertgleason.movie.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/movies/")
public class MovieController {

    private final MovieService movieService;


    @PostMapping
    public ResponseEntity<Movie> saveNewMovie(@RequestBody Movie movie) {
        log.debug("Save New Movie - in controller");

        Movie savedMovie = movieService.saveNewMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

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
