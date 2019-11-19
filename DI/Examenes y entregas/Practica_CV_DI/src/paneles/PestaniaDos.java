/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author lopez
 */
public class PestaniaDos extends JPanel implements ChangeListener {
    
    JCheckBox cNormal;
    JRadioButton rNormal, rUno, rDos, rTres;
    ButtonGroup grupoRadios;

    public PestaniaDos() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void acciones() {
        cNormal.addChangeListener(this);
        rUno.addChangeListener(this);
        rDos.addChangeListener(this);
        rTres.addChangeListener(this);
    }

    private void configurarPanel() {
        this.add(cNormal);
        this.add(rNormal);
        this.add(rUno);
        this.add(rDos);
        this.add(rTres);
    }

    private void instancias() {
        cNormal = new JCheckBox("Activado", false);
        rNormal = new JRadioButton("opcion1", false);
        rUno = new JRadioButton("opcion1", false);
        rDos = new JRadioButton("opcion2", false);
        rTres = new JRadioButton("opcion3", true);
        grupoRadios = new ButtonGroup();
        grupoRadios.add(rUno);
        grupoRadios.add(rTres);
        grupoRadios.add(rDos);
        

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        if (e.getSource() == rUno) {
            System.out.println("tu puta madre");

        } else if (e.getSource() == cNormal) {
            if (cNormal.isSelected()) {
                cNormal.setText("Activado");
            } else {
                cNormal.setText("Desactivado");
            }
        }
    }
    
}
