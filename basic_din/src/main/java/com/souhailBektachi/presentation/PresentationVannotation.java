package com.souhailBektachi.presentation;

import com.souhailBektachi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationVannotation {
    public static void main(String[] args) {
        ApplicationContext context = 
            new AnnotationConfigApplicationContext("com.souhailBektachi.dao", "com.souhailBektachi.metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result = " + metier.calcul());
    }
}
