package com.taffah.Presentation;
import com.taffah.Dao.IDaoImpl;
import com.taffah.Metier.IMetierImpl;

public class MainStatic {
    public static void main(String[] args) {
        IDaoImpl dao=new IDaoImpl();
        IMetierImpl metier =new IMetierImpl();
        metier.setDao(dao);

        System.out.println(metier.calcul());
    }
}