package com.example.survey.management.system.repository;

import com.example.survey.management.system.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission,Integer> {
}
