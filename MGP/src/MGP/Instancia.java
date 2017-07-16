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
public class Instancia {

    private int ID;
    private List<String> valores;

    public Instancia(List<String> valores) {
        this.valores = valores;
        this.ID= 0;
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

    /**
     * @return the valores
     */
    public List<String> getValores() {
        return valores;
    }

    /**
     * @param valores the valores to set
     */
    public void setValores(List<String> valores) {
        this.valores = valores;
    }

}
