package com.example.survey.management.system.controller;

import com.example.survey.management.system.model.Submission;
import com.example.survey.management.system.repository.SubmissionRepository;
import com.example.survey.management.system.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubmissionController {

    @Autowired
    SubmissionService submissionService;

    @Autowired
    SubmissionRepository submissionRepository;

    //add submission
    @PostMapping("submission")
    public String addSubmission(@RequestBody Submission submission){
        return submissionService.addSubmission(submission);
    }


    //edit the submission
    @PutMapping("submission/{submissionId}")
    public String updateSubmission(@RequestBody Submission submission, @PathVariable Integer submissionId){
        boolean b= submissionRepository.existsById(submissionId);
        if(b==false){
            return "submission with id "+submissionId + " does not exist";
        }
        if(submission.getSubmissionId()!=submissionId){
            return "submission id should be same ";
        }

      return  submissionService.updateSubmission(submission,submissionId);
    }

}
