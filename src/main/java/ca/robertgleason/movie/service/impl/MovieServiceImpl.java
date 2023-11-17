package ca.robertgleason.movie.service.impl;


import ca.robertgleason.movie.models.Movie;
import ca.robertgleason.movie.models.MovieGenre;
import ca.robertgleason.movie.service.MovieService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class MovieServiceImpl implements MovieService {

    @Override
    public Movie getMovieById(UUID id) {
        return Movie.builder()
                .id(id)
                .title("Die Hard")
                .director("John McTiernan")
                .genre(MovieGenre.ACTION)
                .releaseDate("1988")
                .runTime(132)
                .rating("R")
                .purchasePrice(new BigDecimal("9.99"))
                .quantityInStock(15)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())


                .build();
    }
}
