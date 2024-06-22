package com.riwi.MapstructWorkshop.api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    @NotNull(message = "Title is required.")
    @Max(value = 100, message = "Title too long. It Must be from 1 - 100 characters.")
    private String title;
    @NotNull(message = "Author's name is required.")
    @Max(value = 100, message = "Name is too long. It Must be from 1 - 100 characters.")
    private String author;
    @NotNull(message = "Publication´s year is required.")
    private int publicationYear;
    @NotNull(message = "Genre is required.")
    @Size(max = 50, message = "Genre is too long. Must be from 1 - 50 characters.")
    private String genre;
    @NotNull(message = "Isbn is required.")
    @Size(max = 20, message = "Isbn is too long. Must be from 1 - 100 characters.")
    private String isbn;
}
