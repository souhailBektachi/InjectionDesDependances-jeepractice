package com.souhailBektachi.dao;

public class DaoImpl implements IDao {


    @Override
    public double getData() {
        System.out.println("Version 1.0");
        double temp = Math.random()*100;
        return temp;
    }
}
