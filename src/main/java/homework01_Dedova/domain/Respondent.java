package homework01_Dedova.domain;

import java.util.ArrayList;

public class Respondent {

    private String name;
    private ArrayList<String> answers;
    private int score;

    public Respondent (String name) {
        this.name = name;
    }
    public String getName () {return name;}

    public void setAnswers (ArrayList <String> answers) {
        this.answers = answers;
    }

    public ArrayList<String> getAnswers () {
        return answers;
    }

    public void setScore (int score) {
        this.score = score;
    }

    public int getScore (){
        return score;
    }
}
