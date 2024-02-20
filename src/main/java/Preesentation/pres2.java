package Presentation;

import Dao.IDao;
import Metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method; // Importer la classe Method depuis java.lang.reflect
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //charger les classes dynamiquement du config.txt
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        //metierImpl
        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        Imetier metier = (Imetier) cMetier.getConstructor().newInstance();

        //on a créé une variable de type Imetier qui ne possède pas "setDAO" alors il faut le ramener:
        Method setDao = cMetier.getDeclaredMethod("setIdao", IDao.class);
        setDao.invoke(metier, dao); //j'invoque setDao sur object metier et comme parametre dao

        System.out.println("le data :" + dao.getData());
        System.out.println("le calcul :" + metier.calcul());
    }
}
