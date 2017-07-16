/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MGP;

/**
 *
 * @author alumnos
 */
public class Dataset {
    private String titulo;
    private Atributos datasetCaracteristicas;
    private Instancias datasetInstancias;
    private int ID;
    
    public Dataset(Atributos datasetCaracteristicas, Instancias datasetInstancias){
        this.datasetCaracteristicas= datasetCaracteristicas;
        this.datasetInstancias= datasetInstancias;
        this.ID=0;
    }

    /**
     * @return the datasetCaracteristicas
     */
    public Atributos getDatasetCaracteristicas() {
        return datasetCaracteristicas;
    }

    /**
     * @param datasetCaracteristicas the datasetCaracteristicas to set
     */
    public void setDatasetCaracteristicas(Atributos datasetCaracteristicas) {
        this.datasetCaracteristicas = datasetCaracteristicas;
    }

    /**
     * @return the datasetInstancias
     */
    public Instancias getDatasetInstancias() {
        return datasetInstancias;
    }

    /**
     * @param datasetInstancias the datasetInstancias to set
     */
    public void setDatasetInstancias(Instancias datasetInstancias) {
        this.datasetInstancias = datasetInstancias;
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
