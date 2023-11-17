package ca.robertgleason.movie.models;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Customer {

    private UUID id;
    private String firstName;
    private String lastName;
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;


}
