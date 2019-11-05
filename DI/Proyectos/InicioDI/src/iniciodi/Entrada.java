/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciodi;

import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario DAM 2
 */
public class Entrada {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
                ventanaprincipal.initGUI();
                ventanaprincipal.acciones();
            }
        });

    }

}
