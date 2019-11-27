/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_psp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario DAM 2
 */
public class Hilo extends Thread {

    public void run() {
        //creo el proceso
        //abro el txt creado
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "ip.txt");
        try {
            pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
