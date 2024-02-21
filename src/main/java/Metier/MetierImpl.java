package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements Imetier{
    @Autowired
    @Qualifier("bdd")
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
