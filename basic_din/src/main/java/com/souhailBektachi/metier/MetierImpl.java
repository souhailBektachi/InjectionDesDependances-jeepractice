package com.souhailBektachi.metier;

import com.souhailBektachi.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double result = data * 23;
        return result;
    }

}
