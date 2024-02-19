package Dao;

public class ImplDao2 implements IDao{
    @Override
    public double getData() {
        System.out.println("version web service");
        double data = 50.2;

        return data;
    }}
