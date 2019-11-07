/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_tema2_di;

import javax.swing.SwingUtilities;

/**
 *
 * @author lopez
 */
public class Examen_Tema2_DI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana v = new Ventana();
                v.initGUI();
            }
        });
    }
    
}
