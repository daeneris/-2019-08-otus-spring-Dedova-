package homework01_Dedova.service;

import homework01_Dedova.dao.CSVReader;
import homework01_Dedova.dao.DataReader;
import homework01_Dedova.domain.Respondent;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class CalculateScoreImpl implements CalculateScore {

    private InterviewService service;
    private DataReader csvReader;

    public CalculateScoreImpl (InterviewService service, DataReader csvReader) {
        this.csvReader = csvReader;
        this.service = service;
    }

    public Respondent calculateScore (){

    int counter = 0;

    Respondent respondent = service.getNewRespondent();
    ArrayList <String> answers = service.saveRespondentAnswers();
    ArrayList<String[]> questions = csvReader.getQuestions();

    for (int i = 0; i < questions.size(); i++) {
        int userAnswers = Integer.parseInt(answers.get(i));
        int systemAnswers = Integer.parseInt(questions.get(i)[questions.get(i).length-1]);
        if (userAnswers==systemAnswers) {
            counter++;
        }
    }

    respondent.setScore(counter);
    return respondent;

}

}
