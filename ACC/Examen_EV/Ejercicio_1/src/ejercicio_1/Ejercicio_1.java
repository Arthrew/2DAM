/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario DAM 2
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       //Creo el directorio dentro de src
       String dir = "C:\\Users\\Usuario DAM 2\\Documents\\Hotels";
       File f = new File(dir);
       f.mkdir();
        
        //Creo los diferentes archivos dentro del directorio
        
        //Las rutas estan personalizadas al ordenador de clase, seguramente haya que cambiarlas
        File alojamiento = new File("C:\\Users\\Usuario DAM 2\\Documents\\Hotels\\alojamiento.txt");
        BufferedWriter  bw1 = new BufferedWriter(new FileWriter(alojamiento));
        
        File localidad = new File("C:\\Users\\Usuario DAM 2\\Documents\\Hotels\\localidad.txt");
        BufferedWriter  bw2 = new BufferedWriter(new FileWriter(localidad));
        
        File servicio = new File("C:\\Users\\Usuario DAM 2\\Documents\\Hotels\\servicio.txt");
        BufferedWriter  bw3 = new BufferedWriter(new FileWriter(servicio));
        
        File cliente = new File("C:\\Users\\Usuario DAM 2\\Documents\\Hotels\\cliente.txt");
        BufferedWriter  bw4 = new BufferedWriter(new FileWriter(cliente));
        
        File reserva = new File("C:\\Users\\Usuario DAM 2\\Documents\\Hotels\\reserva.txt");
        BufferedWriter  bw5 = new BufferedWriter(new FileWriter(reserva));
        
        //Creo un array con los nombres de los archivos
        String[] archivos = f.list();
        
        System.out.printf("Ficheros en el directorio: %d %n", archivos.length);
        
        //Con un bucle saco los nombres de los archivos
        for(int i = 0; i<archivos.length; i++){
            File f2 = new File (dir,archivos[i]);
            System.out.printf("%d. Nombre: %s %n",i,archivos[i]);
        }

    }
    
}
