
package personalizacionletras;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Ventana extends JFrame {
    
    Container container;
    
    public void initGUI(){
        intancias();
        acciones();
        this.setSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void intancias() {
        
    }

    private void acciones() {
        
    }
    
}
