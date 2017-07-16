package MGP;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumnos
 */

public class Instancias {
    private List<Instancia> listaInstancias;
    private int ID;
    
    public Instancias( List<Instancia> listaInstancias){
        this.listaInstancias= listaInstancias;
        this.ID=0;
    }

    /**
     * @return the listaInstancias
     */
    public List<Instancia> getListaInstancias() {
        return listaInstancias;
    }

    /**
     * @param listaInstancias the listaInstancias to set
     */
    public void setListaInstancias(List<Instancia> listaInstancias) {
        this.listaInstancias = listaInstancias;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }


}
