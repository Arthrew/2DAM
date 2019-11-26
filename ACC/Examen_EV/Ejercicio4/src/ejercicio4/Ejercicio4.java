/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario DAM 2
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        //creo un objeto cliente
        Cliente cliente;
        
        //declaro el fichero
        File cliente_txt = new File("cliente.txt");
        FileOutputStream fileout = new FileOutputStream(cliente_txt);
        ObjectOutputStream datosOS = new ObjectOutputStream(fileout);
        
        //Meto los valores en diferentes arrays
        String nombre[] = {"Arturo","Florentino","Pepe"};
        String dni[] = {"34567834F","23456789G","83648295T"};
        int telefono[] = {789987897,7887878,21515278};
        String direccion[] = {"C/Juan de la Cierva","Avda. La Paz","C/Puerto del Angel"};
        int puntos[] = {451,789,4};
        
        //bucle para escribir clientes en el archivo
        for(int i=0;i<nombre.length;i++){
            cliente = new Cliente(nombre[i],dni[i],direccion[i],telefono[i],puntos[i]);
            datosOS.writeObject(cliente);
        }
        datosOS.close();
    }
    
}
