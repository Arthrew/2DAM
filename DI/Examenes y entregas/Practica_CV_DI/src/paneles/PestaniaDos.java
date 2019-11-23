/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import practica_cv_di.Persona;

/**
 *
 * @author lopez
 */
public class PestaniaDos extends JPanel implements ChangeListener, ActionListener {

    JButton botonNormal, bDialogoInfo, bDialogoWarn, bDialogoError, bDialogoOpciones, bDialogoOpcionesPerso,
            bDialogoEntrada, bDialogoEntradaPersona;
    JProgressBar barraProgreso;
    int opcion;

    public PestaniaDos() {

        initGUI();
    }

    public void initGUI() {
        instancias();
        configurarBarra();
        configurarPanel();
        acciones();
    }

    private void configurarBarra() {
        barraProgreso.setMinimum(0);
        barraProgreso.setMaximum(100);
        barraProgreso.setValue(0);
        //barraProgreso.getValue();
        barraProgreso.setStringPainted(true);
        barraProgreso.setBorderPainted(true);

    }

    private void acciones() {
        botonNormal.addActionListener(this);
        bDialogoInfo.addActionListener(this);
        bDialogoWarn.addActionListener(this);
        bDialogoError.addActionListener(this);
        bDialogoOpciones.addActionListener(this);
        bDialogoOpcionesPerso.addActionListener(this);
        bDialogoEntrada.addActionListener(this);
        bDialogoEntradaPersona.addActionListener(this);
        barraProgreso.addChangeListener(this);

    }

    private void configurarPanel() {
        this.add(botonNormal);
        this.add(barraProgreso);
        this.add(bDialogoInfo);
        this.add(bDialogoWarn);
        this.add(bDialogoError);
        this.add(bDialogoOpciones);
        this.add(bDialogoOpcionesPerso);
        this.add(bDialogoEntrada);
        this.add(bDialogoEntradaPersona);
    }

    private void instancias() {
        botonNormal = new JButton("Pulsar");
        barraProgreso = new JProgressBar();
        bDialogoError = new JButton("Error");
        bDialogoWarn = new JButton("Aviso");
        bDialogoInfo = new JButton("Info");
        bDialogoOpciones = new JButton("Pregunta");
        bDialogoOpcionesPerso = new JButton("Pregunta perso");
        bDialogoEntrada = new JButton("Entrada");
        bDialogoEntradaPersona = new JButton("Entrada persona");

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
