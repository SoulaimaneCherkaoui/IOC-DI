package Preesentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao","Metier");
        Imetier metier = context.getBean(Imetier.class);
        System.out.println("le calcul: " + metier.calcul());
    }
}
