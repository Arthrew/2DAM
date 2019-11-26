/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Usuario DAM 2
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //creo objeto alojamiento
        Alojamiento alojamiento;

       //leo el fichero donde tengo los valores
        File archivo = new File("C:\\Users\\Usuario DAM 2\\Documents\\Hotels\\alojamiento.txt");
        FileInputStream filein = new FileInputStream(archivo);
        ObjectInputStream datosOS = new ObjectInputStream(filein);
        
        //saco el resultado por pantalla
        while (true) {
            alojamiento = (Alojamiento) datosOS.readObject();
            
            System.out.printf("%s;%s;%s;%d \n", alojamiento.getNombre(), alojamiento.getLocalidad(), alojamiento.getAlojamiento(), alojamiento.getValoracion());
        }
    }
}
