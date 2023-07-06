package com.solbeg.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal balance;
    private LocalDate birthDay;
    private LocalDate createdOn;


    public User(Long id, String firstName, String lastName, String email, BigDecimal balance, LocalDate birthDay, LocalDate createdOn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.balance = balance;
        this.birthDay = birthDay;
        this.createdOn = createdOn;
    }

    public User() {
    }
}
