package homework01_Dedova.dao;


import java.util.ArrayList;

public interface DataReader {

    void readData(String fileName);
    ArrayList<String[]> getQuestions();
}
