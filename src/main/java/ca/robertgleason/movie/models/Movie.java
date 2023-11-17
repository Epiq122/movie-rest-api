package ca.robertgleason.movie.models;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Movie {
    private UUID id;
    private String title;
    private String director;
    private MovieGenre genre;
    private String releaseDate;
    private Integer runTime;
    private String rating;
    private BigDecimal purchasePrice;
    private Integer quantityInStock;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
