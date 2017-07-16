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
public class Atributo {
    //Atributos
    private String nombre;
    private List<String> valores;
    private int ID;
    //Contructor
    public Atributo(String nombre, List<String> valores){
        this.nombre= nombre;
        this.valores= valores;
        this.ID= 0;
    }
    //Metodos

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
