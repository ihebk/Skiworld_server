package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import contracts.ResortLocal;
import contracts.ResortRemote;

/**
 * Session Bean implementation class Resort
 */
@Stateless
@LocalBean
public class Resort implements ResortRemote, ResortLocal {

    /**
     * Default constructor. 
     */
    public Resort() {
        // TODO Auto-generated constructor stub
    }

}
