package homework01_Dedova.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader implements DataReader {

    public CSVReader (String fileName)
    {
        readData(fileName);
    }

    private ArrayList<String[]> csvText = new ArrayList<>();

    public ArrayList <String[]> getQuestions()
    {
        return csvText;
    }

    public void readData (String fileName) throws NullPointerException {

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream resource = classLoader.getResourceAsStream(fileName);

        if (!resource.equals(null)) {
            Scanner scanner = new Scanner(resource);


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] questionLine = line.split(";");
                csvText.add(questionLine);
            }
        }
    }

}

