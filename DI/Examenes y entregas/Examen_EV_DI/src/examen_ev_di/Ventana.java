/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ev_di;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Usuario DAM 2
 */
public class Ventana extends JFrame implements ActionListener {

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    Container container;
    CardLayout cardL;

    JPanel panelCL;
    JPanel panelDatos;
    JLabel nombre, apellidos, matricula;
    JTextField nombre_txt, apellido_txt, matricula_txt;

    JPanel panelNotas;
    JLabel nota_DI, nota_PMDM, nota_PSP, nota_AD;
    JSpinner notas_DI, notas_PMDM, notas_PSP, notas_AD;
    SpinnerNumberModel modeloSpinnerNumeros, modeloSpinnerNumeros2, modeloSpinnerNumeros3, modeloSpinnerNumeros4;

    JPanel panelResumen;
    JTextArea resultado;

    JMenuBar menu;
    JMenu validar, cambiar;
    JMenuItem itemValidar, datos, notas, resumen;
    JProgressBar progreso;

    int opcion = 0;

    public void initGUI() {

        instancias();
        configMenu();
        configurarBarra();
        configCont();
        acciones();
        this.setSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void instancias() {
        container = this.getContentPane();
        cardL = new CardLayout();

        panelCL = new JPanel();

        panelDatos = new JPanel();
        nombre = new JLabel("Nombre");
        apellidos = new JLabel("Apellidos");
        matricula = new JLabel("Matricula");
        nombre_txt = new JTextField();
        apellido_txt = new JTextField();
        matricula_txt = new JTextField();

        panelNotas = new JPanel();
        nota_DI = new JLabel("NDI");
        nota_PMDM = new JLabel("NPMDM");
        nota_PSP = new JLabel("NPSP");
        nota_AD = new JLabel("NAD");
        modeloSpinnerNumeros = new SpinnerNumberModel(0, 0, 10, 1);
        modeloSpinnerNumeros2 = new SpinnerNumberModel(0, 0, 10, 1);
        modeloSpinnerNumeros3 = new SpinnerNumberModel(0, 0, 10, 1);
        modeloSpinnerNumeros4 = new SpinnerNumberModel(0, 0, 10, 1);
        notas_DI = new JSpinner(modeloSpinnerNumeros);
        notas_PMDM = new JSpinner(modeloSpinnerNumeros2);
        notas_PSP = new JSpinner(modeloSpinnerNumeros3);
        notas_AD = new JSpinner(modeloSpinnerNumeros4);

        panelResumen = new JPanel();
        resultado = new JTextArea();

        menu = new JMenuBar();
        validar = new JMenu("Validar");
        itemValidar = new JMenuItem("Validar");
        itemValidar.setActionCommand("validar");

        cambiar = new JMenu("Cambiar");
        datos = new JMenuItem("Introducir datos");
        datos.setActionCommand("panelDatos");
        notas = new JMenuItem("Introducir notas");
        notas.setActionCommand("panelNotas");
        notas.setEnabled(false);
        resumen = new JMenuItem("Resumen");
        resumen.setActionCommand("panelResumen");

        progreso = new JProgressBar();
    }

    private void configMenu() {
        menu.add(validar);
        menu.add(cambiar);

        panelCL = new JPanel();

        validar.add(itemValidar);
        cambiar.add(datos);
        cambiar.add(notas);
        cambiar.add(resumen);

        this.setJMenuBar(menu);
    }

    private void configCont() {
        container.setLayout(new BorderLayout());
        container.add(configCentro(), BorderLayout.CENTER);
        container.add(progreso, BorderLayout.SOUTH);
    }

    private void acciones() {
        itemValidar.addActionListener(this);

        datos.addActionListener(this);
        notas.addActionListener(this);
        resumen.addActionListener(this);

        nombre_txt.addKeyListener(new Letras());
        apellido_txt.addKeyListener(new Letras());
        matricula_txt.addKeyListener(new Numeros());
    }

    private JPanel configCentro() {
        panelCL.setLayout(cardL);
        panelCL.add(panelDatos(), "panelDatos");
        panelCL.add(panelNotas(), "panelNotas");
        panelCL.add(panelResumen(), "panelResumen");

        return panelCL;
    }

    private void configurarBarra() {
        progreso.setMinimum(0);
        progreso.setMaximum(100);
        progreso.setValue(0);
        progreso.setStringPainted(true);
        progreso.setBorderPainted(true);
    }

    private JPanel panelDatos() {
        panelDatos.setLayout(new GridLayout(3, 2));
        panelDatos.add(nombre);
        panelDatos.add(nombre_txt);
        panelDatos.add(apellidos);
        panelDatos.add(apellido_txt);
        panelDatos.add(matricula);
        panelDatos.add(matricula_txt);

        return panelDatos;
    }

    private Component panelNotas() {
        panelNotas.setLayout(new GridLayout(4, 2));
        panelNotas.add(nota_DI);
        panelNotas.add(notas_DI);
        panelNotas.add(nota_PMDM);
        panelNotas.add(notas_PMDM);
        panelNotas.add(nota_PSP);
        panelNotas.add(notas_PSP);
        panelNotas.add(nota_AD);
        panelNotas.add(notas_AD);

        return panelNotas;
    }

    private Component panelResumen() {
        panelResumen.setLayout(new FlowLayout());
        panelResumen.add(resultado);
        return panelResumen;
    }

    class Letras extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            char evento = e.getKeyChar();
            if (Character.isDigit(evento)) {
                e.consume();
            }
        }
    }
    
    class Numeros extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            char evento = e.getKeyChar();
            if (Character.isLetter(evento)) {
                e.consume();
            }
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "validar":
                
                if (panelDatos.isShowing()) {
                    
                    boolean regular = false;

                    for (int i = 0; i < listaPersonas.size(); i++) {
                        if (listaPersonas.get(i).getMatricula().equals(matricula_txt.getText())) {
                            regular = true;
                            break;
                        }
                    }

                    if (!regular && !nombre_txt.getText().equals("") && !apellido_txt.getText().equals("") && !matricula_txt.getText().equals("")) {
                        /*
                    Persona p = new Persona(nombre, apellido, matricula);
                    listaPersonas.add(p);
                         */
                        opcion = 1;
                        cardL.show(panelCL, "panelNotas");
                        progreso.setValue(progreso.getValue() + 50);

                    } else if (regular) {
                        JOptionPane.showMessageDialog(Ventana.this, "Esta matrícula ya está en uso",
                                "ERROR", JOptionPane.ERROR_MESSAGE, null);
                    } else {
                        JOptionPane.showMessageDialog(Ventana.this, "Introduce todos los datos",
                                "ERROR", JOptionPane.ERROR_MESSAGE, null);

                    }

                } else if (panelNotas.isShowing()) {
                    String nombre = nombre_txt.getText();
                    String apellido = apellido_txt.getText();
                    String matricula = matricula_txt.getText();
                    int notaDI = (int) notas_DI.getValue();
                    int notaPMDM = (int) notas_PMDM.getValue();
                    int notaPSP = (int) notas_PSP.getValue();
                    int notaAD = (int) notas_AD.getValue();

                    Persona p = new Persona(nombre, apellido, matricula, notaDI, notaPMDM, notaPSP, notaAD);
                    listaPersonas.add(p);
                    cardL.show(panelCL, "panelResumen");
                    progreso.setValue(progreso.getValue() + 50);
                    nombre_txt.setText("");
                    apellido_txt.setText("");
                    matricula_txt.setText("");
                    notas_DI.setValue(0);
                    notas_PMDM.setValue(0);
                    notas_PSP.setValue(0);
                    notas_AD.setValue(0);

                    resultado.setText(resultado.getText() + "\n" + p.toString());

                    if (progreso.getValue() == 100) {
                        JOptionPane.showMessageDialog(Ventana.this, "Alumno agregado correctamente",
                                "Agregado", JOptionPane.INFORMATION_MESSAGE, null);
                        progreso.setValue(0);
                    }
                }

                break;

            case "panelDatos":
                cardL.show(panelCL, "panelDatos");
                break;

            case "panelNotas":
                cardL.show(panelCL, "panelNotas");
                break;

            case "panelResumen":
                cardL.show(panelCL, "panelResumen");
                break;
        }
    }

}
