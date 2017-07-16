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

public class Atributos {
    private List<Atributo> listaCaracteristicas;
    private int ID;
    
    public Atributos( List<Atributo> listaCaracteristicas){
        this.listaCaracteristicas= listaCaracteristicas;
        this.ID=0;
    }

    /**
     * @return the listaCaracteristicas
     */
    public List<Atributo> getListaCaracteristicas() {
        return listaCaracteristicas;
    }

    /**
     * @param listaCaracteristicas the listaCaracteristicas to set
     */
    public void setListaCaracteristicas(List<Atributo> listaCaracteristicas) {
        this.listaCaracteristicas = listaCaracteristicas;
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
