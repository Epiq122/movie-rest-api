package ca.robertgleason.movie.service;

import ca.robertgleason.movie.models.Movie;

import java.util.UUID;

public interface MovieService {

    Movie getMovieById(UUID id);
}
