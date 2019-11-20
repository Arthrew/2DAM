/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lopez
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\lopez\\Documents\\pene.txt");
        FileReader fic = new FileReader(f);
        int i;
        while ((i=fic.read()) != -1){
            System.out.println((char)i);
            fic.close();
        }
    }
    
}
