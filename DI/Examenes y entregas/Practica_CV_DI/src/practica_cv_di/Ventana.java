/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_cv_di;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lopez
 */
public class Ventana extends JFrame{

    Container container;
    // panel personalizado
    PestaniaUno pestaniaUno;
    JTabbedPane panelPestanias;
    
    
    public void initGUI(){
        
        instancias();
        configurarContainer();
        this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Botones",pestaniaUno);
        
    }

    private void instancias() {
        container = this.getContentPane();
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaUno = new PestaniaUno();

    }



    private void configurarConstraint(int posx, int posy, int tx, int ty,
                                      int ali, int fill, double pesx, double pesy, Component component, JPanel panel) {

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridwidth = tx;
        constraints.gridheight = ty;
        constraints.gridx = posx;
        constraints.gridy = posy;
        constraints.anchor = ali;
        constraints.fill = fill;
        constraints.weightx = pesx;
        constraints.weighty = pesy;
        panel.add(component, constraints);

    }

    private Component configurarCentro() {
        panelCentro.setLayout(new GridBagLayout());


        configurarConstraint(0, 0, 1, 1, GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL, 0.2, 0, b1, panelCentro);
        configurarConstraint(1, 0, 1, 1, GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL, 0.8, 0, b2, panelCentro);
        return panelCentro;
    }
    
}
