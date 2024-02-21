package Metier;

import Dao.IDao;

public class MetierImpl implements Imetier{
    private IDao Idao=null;

    @Override
    public double calcul() {
        double data = Idao.getData();
        double res = data*2;
        return res;
    }
    public void setIdao(IDao idao){
        this.Idao= idao;
    }
}
