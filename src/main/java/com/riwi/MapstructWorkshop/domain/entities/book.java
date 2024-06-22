package com.riwi.MapstructWorkshop.domain.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity( name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @Column(length = 100,nullable = false)
    String title;
    @Column(length = 100,nullable = false)
    String author;
    @Column(nullable = false)
    int publicationYear;
    @Column(length = 50,nullable = false)
    String genre;
    @Column(length = 20,nullable = false)
    String isbn;

//    @OneToMany(mappedBy = "Book")
//    private List<Loan> loans;
//
//    @OneToMany(mappedBy = "Book")
//    private List<Reservation> reservations;
}
