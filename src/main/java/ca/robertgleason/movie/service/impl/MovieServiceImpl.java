package ca.robertgleason.movie.service.impl;


import ca.robertgleason.movie.models.Movie;
import ca.robertgleason.movie.models.MovieGenre;
import ca.robertgleason.movie.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Service
@Slf4j
public class MovieServiceImpl implements MovieService {

    public Map<UUID, Movie> movieMap;

    public MovieServiceImpl() {
        this.movieMap = new HashMap<>();

        Movie movie1 = Movie.builder()
                .id(UUID.randomUUID())
                .title("Nightmare on Elm Street")
                .director("Wes Craven")
                .genre(MovieGenre.HORROR)
                .releaseDate("1984")
                .runTime(91)
                .rating("R")
                .purchasePrice(new BigDecimal("9.99"))
                .quantityInStock(15)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();


        Movie movie2 = Movie.builder()
                .id(UUID.randomUUID())
                .title("The Matrix")
                .director("Lana Wachowski")
                .genre(MovieGenre.ACTION)
                .releaseDate("1999")
                .runTime(136)
                .rating("R")
                .purchasePrice(new BigDecimal("9.99"))
                .quantityInStock(15)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();


        Movie movie3 = Movie.builder()
                .id(UUID.randomUUID())
                .title("Toy Story")
                .director("John Lasseter")
                .genre(MovieGenre.ANIMATION)
                .releaseDate("1995")
                .runTime(81)
                .rating("G")
                .purchasePrice(new BigDecimal("19.99"))
                .quantityInStock(1)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();


        movieMap.put(movie1.getId(), movie1);
        movieMap.put(movie2.getId(), movie2);
        movieMap.put(movie3.getId(), movie3);
    }


    @Override
    public List<Movie> listMovies() {
        return new ArrayList<>(movieMap.values());
    }

    @Override
    public Movie getMovieById(UUID id) {

        log.debug("Get Movie by Id - in service id: " + id.toString());
        return movieMap.get(id);
    }
}
