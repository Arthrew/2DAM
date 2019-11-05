/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario DAM 2
 */
public class Objetos {

    
    public static void main(String[] args) {
        
        File fichero = new File(pathname:"src/documentos/alumnos.obj");
        FileOutputStream ficheroOutput = null;
        try {
            ficheroOutput = new FileOutputStream(fichero);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            //
        }
        try {
            ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream();
            
        } catch (IOException e) {
        }
    }
    
}
