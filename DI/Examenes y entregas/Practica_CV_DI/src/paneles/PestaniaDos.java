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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonNormal) {
            barraProgreso.setValue(barraProgreso.getValue() + 25);
            if (barraProgreso.getValue() == 100) {
                getToolkit().beep();
            }
        } else if (e.getSource() == bDialogoInfo) {
            JOptionPane.showMessageDialog(PestaniaDos.this, "Este es un diálogo de información",
                    "Titulo del mensaje", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (e.getSource() == bDialogoError) {

            JOptionPane.showMessageDialog(PestaniaDos.this, "Este es un diálogo de error",
                    "Titulo del mensaje", JOptionPane.ERROR_MESSAGE, null);

<<<<<<< HEAD
        if (e.getSource() == rUno) {
            System.out.println("tu puta madre");
=======
        } else if (e.getSource() == bDialogoWarn) {
            JOptionPane.showMessageDialog(PestaniaDos.this, "Este es un diálogo de warning",
                    "Titulo del mensaje", JOptionPane.WARNING_MESSAGE, null);
        } else if (e.getSource() == bDialogoOpciones) {
            opcion = JOptionPane.showConfirmDialog(PestaniaDos.this,
                    "¿Segudo que quieres continuar?",
                    "Titulo del mensaje", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null);
>>>>>>> c271c9bd5ec65ff1bb64c3cede7e3af45aebf7d5


            if (opcion == JOptionPane.YES_OPTION) {
                System.out.println("Pulsado si");
            } else if (opcion == JOptionPane.NO_OPTION) {
                System.out.println("Pulsado no");
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
                System.out.println("Pulsado cancelar");
            }

        } else if (e.getSource() == bDialogoOpcionesPerso) {
            String[] opciones = {"Botón1", "Botón2", "Botón3"};
            Persona[] personas = {new Persona("Nombre1", "Apellido1", 123, 123, false),
                    new Persona("Nombre2", "Apellido2", 123, 123, false),
                    new Persona("Nombre3", "Apellido3", 123, 123, false)};
            int opcionPerso = JOptionPane.showOptionDialog(PestaniaDos.this, "Selecciona una opción",
                    "Título del diálogo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    personas, personas[0]);
            switch (opcionPerso) {
                case 0:
                    System.out.println("Boton 1 pulsado");
                    break;
                case 1:
                    System.out.println("Boton 2 pulsado");
                    break;
                case 2:
                    System.out.println("Boton 3 pulsado");
                    break;
            }
        } else if (e.getSource() == bDialogoEntrada){
            String datoIntro = JOptionPane.showInputDialog(PestaniaDos.this, "Introduce datos",
                    "Mensaje",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(datoIntro);
        } else if (e.getSource() == bDialogoEntradaPersona){
            Persona[] personas = {new Persona("Nombre1", "Apellido1", 123, 123, false),
                    new Persona("Nombre2", "Apellido2", 123, 123, false),
                    new Persona("Nombre3", "Apellido3", 123, 123, false)};

            Persona seleccionada = (Persona) JOptionPane.showInputDialog(PestaniaDos.this,"Selecciona una persona",
                    "Titulo",JOptionPane.INFORMATION_MESSAGE,null,personas,personas[0]);
            System.out.println(seleccionada.getNombre());
        }
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if (barraProgreso.getValue() == 100) {
            JOptionPane.showMessageDialog(PestaniaDos.this, "Proceso completo",
                    "Titulo del mensaje", JOptionPane.INFORMATION_MESSAGE, null);

        }
    }
    
}
