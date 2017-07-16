/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MGP;

import java.io.FileNotFoundException;

/**
 *
 * @author alumnos
 */
public class Main {
    public static void main(String[] cadena) throws FileNotFoundException{
        String ruta = "D://weather_nominal.txt";
        LectorArff lector = new LectorArff();
        lector.leerDataset(ruta);
    }
}
