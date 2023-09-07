package com.example.survey.management.system.controller;

import com.example.survey.management.system.model.Survey;
import com.example.survey.management.system.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SurveyController {

    @Autowired
    SurveyService surveyService;
    @PostMapping("survey")
    public String createSurvey(@RequestBody Survey survey){
       return surveyService.createSurvey(survey);
    }


    //respondent see the all survey based on their age

    @GetMapping("surveys/{age}")
    public List<Survey> getSurveys(@PathVariable Integer age){
        return surveyService.getSurveys(age);
    }
}
