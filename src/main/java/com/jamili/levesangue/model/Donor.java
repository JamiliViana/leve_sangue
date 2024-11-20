package com.jamili.levesangue.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String cpf;

    private String firstName;

    private String lastName;

    private char gender;

    private String birthDate;

    private String bloodType;

    private String postalCode;

    private String state;

    private String phone;
}
