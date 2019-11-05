/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciodi;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario DAM 2
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    Container container;
    JButton boton, botonDos;
    JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    JPanel panelSuperior;
    
    public void initGUI(){
        instancias();
        configurarContainer();
        this.setTitle("Ejemplo inicial de ventana");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
        //this.pack();
        this.setVisible(true);
    }
    
    
    public JPanel configurarPanelSuperior(){
        panelSuperior.setLayout(new GridLayout(1,3));
        panelSuperior.add(etiqueta1);
        panelSuperior.add(etiqueta2);
        panelSuperior.add(etiqueta3);
        return panelSuperior;
    }
    
    public void acciones(){
        boton.addActionListener(this);
        botonDos.addActionListener(this);
    }

    private void instancias() {
        container = this.getContentPane();
        boton = new JButton("PULSAR");
        botonDos = new JButton("PULSAR DOS");
        etiqueta1 = new JLabel("Posicion 1");
        etiqueta2 = new JLabel("Posicion 2");
        etiqueta3 = new JLabel("Posicion 3");
        etiqueta4 = new JLabel("Posicion 4");
        panelSuperior = new JPanel();
    }

    private void configurarContainer() {
        /*container.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        container.setLayout(new GridLayout(3, 3));
        container.setLayout(new BorderLayout());
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(etiqueta1, BorderLayout.NORTH);
        container.add(etiqueta2, BorderLayout.SOUTH);
        container.add(etiqueta3, BorderLayout.WEST);
        container.add(etiqueta4, BorderLayout.EAST);
        container.add(boton, BorderLayout.CENTER);
        container.add(botonDos);*/
        container.setLayout(new BorderLayout());
        
        container.add(configurarPanelSuperior(),BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == boton){
            System.out.println("Pulsado boton 1");
        
        }else if(e.getSource() == botonDos){
            System.out.println("Pulsado boton 2");
            
        }
    }
    
}
