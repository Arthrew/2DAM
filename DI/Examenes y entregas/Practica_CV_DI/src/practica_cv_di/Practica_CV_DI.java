package practica_cv_di;


import javax.swing.*;


public class Practica_CV_DI{
    
    
    
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
