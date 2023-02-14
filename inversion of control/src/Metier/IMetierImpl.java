package Metier;

import Dao.IDao;

public class IMetierImpl implements IMetier{
    private IDao dao; // couplage faible
    @Override
    public double calcule() {
        double temp=dao.getData();
        return temp*540/Math.cos(temp*Math.PI);
    }
    /*
    * Injecter dans la variable dao un objet d'une classe classe qui implémente l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
