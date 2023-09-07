package com.example.survey.management.system.service;

import com.example.survey.management.system.model.Survey;
import com.example.survey.management.system.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SurveyService {

    @Autowired
    SurveyRepository surveyRepository;
    public String createSurvey(Survey survey) {
        surveyRepository.save(survey);
        return "survey created successfully!!!";
    }

    public List<Survey> getSurveys(Integer age) {
        List<Survey> allSurvey= surveyRepository.findAll();

        List<Survey> desiredSurvey=new ArrayList<>();

        for(Survey survey: allSurvey){
            if(survey.getMinAge()<=age){
                desiredSurvey.add(survey);
            }
        }
        return desiredSurvey;
    }
}
