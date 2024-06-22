package com.riwi.MapstructWorkshop.domain.entities;

import com.riwi.MapstructWorkshop.utils.enaums.RoleUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.util.List;

@Entity( name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @Column(length = 50,nullable = false)
    String username;
    @Column(length = 100,nullable = false)
    String password;
    @Column(length =100,nullable = false)
    String email;
    @Column(length =100,nullable = false)
    String full_name;
    @Enumerated(EnumType.STRING)
    RoleUser role;


    @OneToMany(mappedBy = "User")
    private List<Loan> loans;

    @OneToMany(mappedBy = "User")
    private List<Reservation> reservations;

}
