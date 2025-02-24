package com.souhailBektachi.presentation;

import com.souhailBektachi.dao.DaoImpl;
import com.souhailBektachi.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
