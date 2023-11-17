package ca.robertgleason.movie.service;

import ca.robertgleason.movie.models.Movie;

import java.util.List;
import java.util.UUID;

public interface MovieService {

    List<Movie> listMovies();

    Movie getMovieById(UUID id);
}
