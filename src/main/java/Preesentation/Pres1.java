package Preesentation;

import Dao.ImplDao;
import Dao.ImplDao2;
import Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        ImplDao2 dao = new ImplDao2();
        MetierImpl metier = new MetierImpl();
        metier.setIdao(dao);
        System.out.println("le calcul :"+ metier.calcul());
    }
}
