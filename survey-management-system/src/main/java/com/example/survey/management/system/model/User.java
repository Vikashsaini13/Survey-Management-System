package com.example.survey.management.system.model;

import com.example.survey.management.system.model.enums.Gender;
import com.example.survey.management.system.model.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;
    private Integer userAge;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Type userType;

    @Column(unique = true)
    private String userEmail;
    private String password;


}
