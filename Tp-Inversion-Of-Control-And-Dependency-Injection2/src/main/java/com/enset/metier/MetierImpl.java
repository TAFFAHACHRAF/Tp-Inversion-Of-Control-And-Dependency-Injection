package com.enset.metier;

import com.enset.Dao.IPersonne;

//@Component
public final class MetierImpl implements IMetier {
    //@Autowired // we remove Autowired when we use the constructor
    IPersonne personne;


    public MetierImpl(IPersonne personne) {
        this.personne = personne;
    }

    @Override
    public String CalculeAge() {
        return personne.getAge();
    }
}
