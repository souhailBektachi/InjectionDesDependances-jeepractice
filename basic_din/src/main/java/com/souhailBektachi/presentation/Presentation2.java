package com.souhailBektachi.presentation;

import com.souhailBektachi.dao.IDao;
import com.souhailBektachi.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Presentation2 {

    public void main(String[] args) throws FileNotFoundException {
        try{
        Scanner s = new Scanner(new File("config.txt"));
        String daoClassName = s.nextLine();
        String metierClassName = s.nextLine();
        Class cDao = Class.forName(daoClassName);
        Class cMetier = Class.forName(metierClassName);

        IDao Dao= (IDao) cDao.getConstructor().newInstance();
        IMetier Metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(Dao);
        System.out.println(Metier.calcul());

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }

}
