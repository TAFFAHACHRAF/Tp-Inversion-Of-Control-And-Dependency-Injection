package com.taffah.Metier;

import com.taffah.Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class IMetierImpl implements IMetier{
    @Autowired
    IDao dao;
    // constructor
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }
    public IMetierImpl() {}

    @Override
    public double calcul() {
        return Math.pow(dao.getDate().getDay(),5);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public IDao getDao() {
        return dao;
    }
}
