package com.farhan.reservation.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUsers {
    private Long id;
    private String userName;
    private String role;
    private String password;
}

