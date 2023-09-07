package com.example.survey.management.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer surveyId;
    private String surveyTitle;

    //setting the minimum age for this survey of respondent(this survey only share with those have minimum age:minAge)
    private Integer minAge;

    @ManyToOne
    @JoinColumn(name = "fk_co_user_id")
    private User surveyCoordinator;
}
