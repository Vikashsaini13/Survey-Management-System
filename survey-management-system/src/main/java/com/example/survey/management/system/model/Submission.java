package com.example.survey.management.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer submissionId;

    private String submissionBody;

    private LocalDateTime submissionTimeStamp=LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "fk_res_user_id")
    private User respondent;

    @ManyToOne
    @JoinColumn(name = "fk_survey_id")
    private Survey survey;
}
