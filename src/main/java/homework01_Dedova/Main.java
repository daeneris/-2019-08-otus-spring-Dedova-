package homework01_Dedova;

import homework01_Dedova.domain.Respondent;
import homework01_Dedova.service.CalculateScore;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        CalculateScore c = context.getBean(CalculateScore.class);
        Respondent respondent = c.calculateScore();
        System.out.println(respondent.getName() + ", спасибо за прохождение опроса. Ваш результат: " + respondent.getScore());

  }

 }
