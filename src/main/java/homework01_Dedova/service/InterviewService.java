package homework01_Dedova.service;

import homework01_Dedova.domain.Respondent;

import java.util.ArrayList;


public interface InterviewService {

    Respondent getNewRespondent();

    ArrayList<String> saveRespondentAnswers();

}
