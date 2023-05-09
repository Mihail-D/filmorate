package ru.yandex.practicum.filmorate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Genre {

    private int id;
    @Size(min = 1, max = 50, message = "The length of the genre name must be between 1 and 50 characters.")
    private String name;
}