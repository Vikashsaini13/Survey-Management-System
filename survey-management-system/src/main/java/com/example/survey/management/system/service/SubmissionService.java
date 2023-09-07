package com.example.survey.management.system.service;

import com.example.survey.management.system.model.Submission;
import com.example.survey.management.system.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {

    @Autowired
    SubmissionRepository submissionRepository;

    public String addSubmission(Submission submission) {
        submissionRepository.save(submission);
        return "submission added successfully!!!";
    }

    public String updateSubmission(Submission submission, Integer submissionId) {

        Submission existingSubmission=submissionRepository.findById(submissionId).get();

        existingSubmission.setSubmissionBody(submission.getSubmissionBody());
        existingSubmission.setRespondent(submission.getRespondent());
        existingSubmission.setSurvey(submission.getSurvey());

        submissionRepository.save(existingSubmission);

        return "submission update successfully!!!";
    }
}
