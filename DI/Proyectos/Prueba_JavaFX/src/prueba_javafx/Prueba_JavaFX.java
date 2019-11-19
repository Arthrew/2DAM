
package prueba_javafx;

import javax.swing.SwingUtilities;


public class Prueba_JavaFX {

    
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
