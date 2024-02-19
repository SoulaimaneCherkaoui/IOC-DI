package Metier;

import Dao.IDao;

public class MetierImpl implements Imetier{
    private IDao idao=null;

    @Override
    public double calcul() {
        double data = idao.getData();
        double res = data*2;
        return res;
    }
    public void setIdao(IDao idao){
        this.idao= idao;
    }
}
