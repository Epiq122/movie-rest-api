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


        Movie savedMovie = movieService.saveNewMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Movie> listMovies() {


        return movieService.listMovies();
    }


    @GetMapping("{movieId}")
    public Movie getMovieById(@PathVariable("movieId") UUID movieId) {


        return movieService.getMovieById(movieId);

    }

}
