package Preesentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = context.getBean(Imetier.class);
        System.out.println("Le resultat :" + metier.calcul());
    }
}
