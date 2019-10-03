package homework01_Dedova.service;

import homework01_Dedova.dao.CSVReader;
import homework01_Dedova.domain.Respondent;

import java.util.ArrayList;
import java.util.Scanner;


public class InterviewServiceImpl implements InterviewService {

    private CSVReader csvReader;
    private Respondent respondent;

    public InterviewServiceImpl(CSVReader csvReader) {
        this.csvReader = csvReader;
    }

    public Respondent getNewRespondent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Представьтесь, пожалуйста.");
        String name = in.nextLine();
        respondent = new Respondent(name);
        System.out.println("Добро пожаловать, " + name + "! Пройдите, пожалуйста, опрос.");

        return  respondent;
    }

        public ArrayList<String> saveRespondentAnswers() {
        ArrayList <String> userAnswers = new ArrayList<>();
        ArrayList <String[]> questions = csvReader.getQuestions();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            String[] line = questions.get(i);
            for (int j = 0; j < line.length-1; j++) {
                if (j<1) {
                    System.out.println(line[j]);
                } else {
                    System.out.println(j + "." + line[j]);
                }
            }
            userAnswers.add(in.nextLine());
        }
            respondent.setAnswers(userAnswers);
        return userAnswers;
    }

}
