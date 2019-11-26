/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_examen;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario DAM 2
 */
public class Prueba_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona persona;
        
        File fichero = new File("FichPersona.txt");
        
        FileInputStream fileout = new FileInputStream(fichero);
        
        ObjectInputStream datosOS = new ObjectInputStream(fileout);
        /*
        String nombres[] = {"Ana", "Miguel","Pedro"};
        int edades[] = {14,15,13};
        */
        try{
        while(true){
            persona = (Persona)datosOS.readObject();
            System.out.printf("Nombre: %s, edad %d %n", persona.getNombre(), persona.getEdad());
        }
        }catch (EOFException eo){
            System.out.println("FIN DE LECTURA");
        }
        datosOS.close();
    }
    
}
