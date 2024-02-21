package Dao;

import org.springframework.stereotype.Component;

@Component("bdd")
public class ImplDao implements IDao{
    @Override
    public double getData() {
        System.out.println("version bdd");
        double data = 24.2;

        return data;
    }
}
