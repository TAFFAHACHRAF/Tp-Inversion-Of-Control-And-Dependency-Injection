package Ext;

import Dao.IDao;

public class IDaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs");
        return /*temp*/ 1000;
    }
}
