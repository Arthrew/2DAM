package paneles;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import practica_cv_di.Persona;
import practica_cv_di.Ventana;

public class PestaniaUno extends JPanel implements ActionListener {

    Container contenedor;

    ButtonGroup grupoRadios;
    JRadioButton rUno, rDos, rTres;
    JLabel titulo, lb_nombre, lb_direccion, lb_telefono, lb_dni, lb_seleccionEstudios, lb_aniosExperiencia;
    JTextField nombre, direccion, dni, telefono;
    JButton btnDatos, btnSalir;
    JSpinner aniosExp;
    SpinnerModel modeloSpinner;
    JPanel pCentro;
    JComboBox<String> estudios;

    public PestaniaUno() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void instancias() {

        rUno = new JRadioButton("Soltero", false);
        rDos = new JRadioButton("Casado", false);
        rTres = new JRadioButton("Divorciado", true);
        grupoRadios = new ButtonGroup();
        grupoRadios.add(rUno);
        grupoRadios.add(rDos);
        grupoRadios.add(rTres);

        pCentro = new JPanel();

        titulo = new JLabel("POR FAVOR, RELLENA LOS DATOS DE TU CURRICULUM");
        lb_nombre = new JLabel("Nombre");
        lb_direccion = new JLabel("Direccion");
        lb_telefono = new JLabel("Telefono");
        lb_dni = new JLabel("DNI");
        lb_seleccionEstudios = new JLabel("Selecciona tus estudios");
        lb_aniosExperiencia = new JLabel("Años de experiencia");

        btnDatos = new JButton("Insertar Datos");
        btnSalir = new JButton("Salir");

        nombre = new JTextField();
        direccion = new JTextField();
        telefono = new JTextField();
        dni = new JTextField();

        modeloSpinner = new SpinnerNumberModel(1, 1, 50, 1);
        aniosExp = new JSpinner(modeloSpinner);

        estudios = new JComboBox();
        estudios.addItem("Ingenieria Informatica");
        estudios.addItem("Ingenieria Industrial");
        estudios.addItem("Ingenieria Telecomunicaciones");
        estudios.addItem("Arquitectura");
        estudios.addItem("Derecho");

    }

    private void acciones() {
        btnDatos.setActionCommand("Insertar");
        btnSalir.setActionCommand("Salir");
        btnDatos.addActionListener(this);
        btnSalir.addActionListener(this);
        direccion.addActionListener(this);
        nombre.addActionListener(this);
        telefono.addActionListener(this);
        dni.addActionListener(this);

    }

    private void configurarConstrait(int x, int y, int tx, int ty, double px, double py, int anchor, int fill, Component c) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = tx;
        constraints.gridheight = ty;
        constraints.weightx = px;
        constraints.weighty = py;
        constraints.anchor = anchor;
        constraints.fill = fill;
        pCentro.add(c, constraints);
    }

    private void configurarPanel() {
        this.setLayout(new BorderLayout());
        pCentro.setLayout(new GridBagLayout());
        configurarConstrait(0, 0, 6, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.CENTER, titulo);
        configurarConstrait(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, lb_nombre);
        configurarConstrait(0, 2, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, nombre);
        configurarConstrait(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, lb_direccion);
        configurarConstrait(0, 4, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, direccion);
        configurarConstrait(0, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, lb_telefono);
        configurarConstrait(0, 6, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, telefono);
        configurarConstrait(0, 7, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, lb_dni);
        configurarConstrait(0, 8, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, dni);

        configurarConstrait(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, Box.createHorizontalStrut(20));

        configurarConstrait(3, 1, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, lb_seleccionEstudios);
        configurarConstrait(3, 2, 3, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, estudios);
        configurarConstrait(3, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, rUno);
        configurarConstrait(4, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, rDos);
        configurarConstrait(5, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, rTres);
        configurarConstrait(3, 6, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, lb_aniosExperiencia);
        configurarConstrait(5, 6, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, aniosExp);
        configurarConstrait(3, 7, 2, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, btnDatos);
        configurarConstrait(5, 7, 1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, btnSalir);
        this.add(pCentro, BorderLayout.CENTER);

    }

    public void stateChanged(ChangeEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salir":
                System.exit(0);
                break;
            case "Insertar":
                agregarPersonas();
                break;

        }
    }

    public void agregarPersonas() {
        String nombre_1 = nombre.getText();
        int experiencia_1 = Integer.parseInt(aniosExp.getModel().getValue().toString());
        int tlf = Integer.parseInt(telefono.getText());
        String dni_1 = dni.getText();
        String direccion_1 = direccion.getText();
        String profesion = estudios.getSelectedItem().toString();
        String estado;

        if (rUno.isSelected()) {
            estado = rUno.getText();
        } else if (rDos.isSelected()) {
            estado = rDos.getText();
        } else {
            estado = rTres.getText();
        }

        if (!comprobar(dni_1)) {
            Persona persona = new Persona(nombre_1, direccion_1, dni_1, profesion, estado, tlf, experiencia_1);
            Ventana.listaPersonas.add(persona);
            JOptionPane.showMessageDialog(this, "Persona agregada correctamente");
            nombre.setText("");
            direccion.setText("");
            telefono.setText("");
            dni.setText("");
            

        }
    }

    public boolean comprobar(String dNi) {
        for (int i = 0; i < Ventana.listaPersonas.size(); i++) {
            if (dNi.equalsIgnoreCase(Ventana.listaPersonas.get(i).getDni())) {
                JOptionPane.showMessageDialog(null, "La persona ya existe en la Base de datos");
                return true;
            }
        }

        return false;

    }
}
