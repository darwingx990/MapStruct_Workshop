package com.riwi.MapstructWorkshop.domain.entities;

import com.riwi.MapstructWorkshop.utils.enaums.LoanStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity( name = "loan")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @Column(nullable = false)
    Date loanDate;
    @Column(nullable = false)
    Date returnDate;
    @Enumerated(EnumType.STRING)
    LoanStatus status;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false)
    private Book book;

}
