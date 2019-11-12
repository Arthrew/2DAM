package examen_tema2_di;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 2
 */
public class Ventana extends JFrame implements ActionListener{
    
    Container container;
    JTabbedPane panelPestanias;
    JButton btnRegistro, btnBuscar, btnPasar;
    JPanel pSuperior, pCentro, pInferior;
    JSpinner notas_DI, notas_PMDM, notas_PSP, notas_AD;
    SpinnerNumberModel modeloSpinnerNumeros,modeloSpinnerNumeros2,modeloSpinnerNumeros3,modeloSpinnerNumeros4;
    JTextField nombre, dni;
    JLabel lb_nombre, lb_DNI, nota_DI, nota_PMDM, nota_PSP, nota_AD;
    ImageIcon imagen;
    
    public void initGUI(){
    
        instancias();
        configurarPanel();
        this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLocation(750,400);
        acciones();
    }
    
    private void acciones() {
        btnRegistro.addActionListener(this);
        btnBuscar.addActionListener(this);
    }
    
    private void configurarPanel() {
        this.setLayout(new BorderLayout());
        container.add(ConfigurarSuperior(), BorderLayout.NORTH);
        container.add(ConfigurarCentro(), BorderLayout.CENTER);
        container.add(ConfigurarInferior(), BorderLayout.SOUTH);
    }

    private JPanel ConfigurarSuperior() {
        pSuperior.setLayout(new FlowLayout());
        pSuperior.add(btnRegistro);
        pSuperior.add(btnBuscar);
        return pSuperior;
    }

    private JPanel ConfigurarCentro() {
        pCentro.setLayout(new GridLayout(0,2));
        pCentro.add(lb_nombre);
        pCentro.add(nombre);
        pCentro.add(lb_DNI);
        pCentro.add(dni);
        pCentro.add(nota_DI);
        pCentro.add(notas_DI);
        pCentro.add(nota_PMDM);
        pCentro.add(notas_PMDM);
        pCentro.add(nota_PSP);
        pCentro.add(notas_PSP);
        pCentro.add(nota_AD);
        pCentro.add(notas_AD);
        
        return pCentro;
    }
    

    private JPanel ConfigurarInferior() {
        pInferior.add(btnPasar);
        return pInferior;
    }
    
    private void instancias() {
        container = this.getContentPane();
        pCentro = new JPanel();
        pSuperior = new JPanel();
        pInferior = new JPanel();
        btnBuscar = new JButton("Ir a buscar");
        btnRegistro = new JButton("Ir a registro");
        btnPasar = new JButton();
        nombre = new JTextField();
        dni = new JTextField();
        lb_nombre = new JLabel("Nombre");
        lb_DNI = new JLabel("DNI");
        nota_DI = new JLabel("Nota DI");
        nota_PMDM = new JLabel("Nota PMDM");
        nota_PSP = new JLabel("Nota PSP");
        nota_AD = new JLabel("Nota AD");
        modeloSpinnerNumeros = new SpinnerNumberModel(0,0,10,1);
        modeloSpinnerNumeros2 = new SpinnerNumberModel(0,0,10,1);
        modeloSpinnerNumeros3 = new SpinnerNumberModel(0,0,10,1);
        modeloSpinnerNumeros4 = new SpinnerNumberModel(0,0,10,1);
        notas_DI = new JSpinner(modeloSpinnerNumeros);
        notas_PMDM = new JSpinner(modeloSpinnerNumeros2);
        notas_PSP = new JSpinner(modeloSpinnerNumeros3);
        notas_AD = new JSpinner(modeloSpinnerNumeros4);
        
        btnPasar.setActionCommand("botonAñadir");
        btnPasar.setIcon(new ImageIcon(getClass().getResource("./follow.png")));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btnBuscar){
        }else if (e.getSource() == btnRegistro) {
        }else if (e.getSource() == btnPasar){
            int nota_Uno = (int)notas_DI.getModel().getValue();
        }
    }

}

