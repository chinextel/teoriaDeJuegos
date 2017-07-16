/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MGP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class LectorArff {
    private Dataset dataset;
    private String titulo;
    private List <String> atributos;
    private List <String> ejemplos;
    //constructor
    public LectorArff(){
    //inicializamos
        this.dataset = null;
        this.titulo = null;
        this.atributos = new ArrayList<String> ();
        this.ejemplos = new ArrayList<String> ();
    }
    public void leerDataset(String pathArff) throws FileNotFoundException{
        //"throws FileNotFoundException" es agregado con el foco amarillo
        FileReader r = new FileReader(pathArff);
        Scanner e = new Scanner(r);
        int estado = 0;
        while (e.hasNextLine()){
            String cad = e.nextLine();
            //System.out.println(cad);
           
            if (estado == 0 && cad.contains("@relation"))
            {
                System.out.println(cad);
                atributos.add(cad);
                estado = 1;
            }
            else if (estado == 1 && cad.contains("@attribute")){
                //System.out.println("Atributo encontrado");
                System.out.println(cad);
                atributos.add(cad);
            }
            else if (estado == 1 && cad.contains("@data"))
            {
                estado = 2;
            }
            else if (estado == 2 && cad.trim().compareTo("")!= 0){
                System.out.println(cad);
                ejemplos.add(cad);
            }
        }
    }
}
