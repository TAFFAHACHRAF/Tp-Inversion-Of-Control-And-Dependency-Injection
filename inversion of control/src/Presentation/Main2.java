package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(new File("config.txt"));
        String daoCLassName=sc.nextLine();
        Class cDao = Class.forName(daoCLassName);
        IDao o= (IDao) cDao.newInstance();


        String metierClasseName=sc.nextLine();
        Class cMatier=Class.forName(metierClasseName);
        IMetier metier=(IMetier) cMatier.newInstance();

        Method Method=cMatier.getMethod("setDao",IDao.class);
        Method.invoke(metier,o);
        System.out.println(metier.calcule());
    }
}
