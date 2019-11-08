
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    private CardLayout cardLayout;
    private Container contenedor;
    private JPanel panelCL;
    private JPanel panelSuperior;
    private JButton botonPanelRegistro;
    private JButton botonPanelBuscarP;
    private JButton botonPanelAnadir;

    private JPanel panelRegistrar;
    private JLabel nombre;
    private JLabel dni;
    private JLabel notaDI;
    private JLabel notaPMDM;
    private JLabel notaPSP;
    private JLabel notaAD;
    private JTextField textoNombre;
    private JTextField textoDNI;
    private JSpinner spinnerDi;
    private JSpinner spinnerPmdm;
    private JSpinner spinnerPsp;
    private JSpinner spinnerAd;
    private SpinnerNumberModel modeloSDi;
    private SpinnerNumberModel modeloSPmdm;
    private SpinnerNumberModel modeloSPsp;
    private SpinnerNumberModel modeloSAd;

    private JPanel panelBuscar;
    private GridBagConstraints gridBagCon;
    private JLabel buscarLabel;
    private JLabel labelMedia;
    private DefaultComboBoxModel modeloComboBox;
    private JComboBox cajaComboPersonas;

    public Ventana() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        confiCont();
        acciones();
        setVisible(true);
        setLocation(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,300);
    }

    private void instancias() {
        contenedor = getContentPane();
        cardLayout = new CardLayout();
        panelCL = new JPanel();
        panelSuperior = new JPanel();
        botonPanelRegistro = new JButton("Ir a Registro");
        botonPanelRegistro.setActionCommand("botonReg");

        botonPanelBuscarP = new JButton("Ir a Buscar");
        botonPanelBuscarP.setActionCommand("botonPanelBuscarP");

        botonPanelAnadir = new JButton();
        botonPanelAnadir.setActionCommand("botonAnadir");
        botonPanelAnadir.setIcon(new ImageIcon(getClass().getResource("./follow.png")));


        panelRegistrar = new JPanel();
        nombre = new JLabel("Nombre");
        dni = new JLabel("DNI");
        notaDI = new JLabel("Nota DI");
        notaPMDM = new JLabel("Nota PMDM");
        notaPSP = new JLabel("Nota PSP");
        notaAD = new JLabel("Nota AD");
        textoNombre = new JTextField();
        textoDNI = new JTextField();
        modeloSDi = new SpinnerNumberModel();
        modeloSDi.setMinimum(0);
        modeloSDi.setMaximum(10);
        modeloSPmdm = new SpinnerNumberModel();
        modeloSPmdm.setMinimum(0);
        modeloSPmdm.setMaximum(10);
        modeloSPsp = new SpinnerNumberModel();
        modeloSPsp.setMinimum(0);
        modeloSPsp.setMaximum(10);
        modeloSAd = new SpinnerNumberModel();
        modeloSAd.setMinimum(0);
        modeloSAd.setMaximum(10);
        spinnerDi = new JSpinner(modeloSDi);
        spinnerPmdm = new JSpinner(modeloSPmdm);
        spinnerPsp = new JSpinner(modeloSPsp);
        spinnerAd = new JSpinner(modeloSAd);

        panelBuscar = new JPanel();
        gridBagCon = new GridBagConstraints();
        buscarLabel = new JLabel("Personas a buscar");
        labelMedia = new JLabel();
        modeloComboBox = new DefaultComboBoxModel();

        cajaComboPersonas = new JComboBox(modeloComboBox);
    }

    private void acciones() {
        botonPanelRegistro.addActionListener(this);
        botonPanelBuscarP.addActionListener(this);
        botonPanelAnadir.addActionListener(this);

        cajaComboPersonas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                e.getItem();
                e.getStateChange();
                Persona p = (Persona) modeloComboBox.getElementAt(cajaComboPersonas.getSelectedIndex());
                if (modeloComboBox.getElementAt(cajaComboPersonas.getSelectedIndex())== null) {

                } else {
                    labelMedia.setText("La media del alumno es " + calcularMedia(p));
                }
            }
        });
    }

    private void confiCont() {
        contenedor.add(pBotones(), BorderLayout.NORTH);
        contenedor.add(pCardLayout(), BorderLayout.CENTER);
        contenedor.add(botonPanelAnadir, BorderLayout.SOUTH);
    }

    private JPanel pBotones() {
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(botonPanelRegistro);
        panelSuperior.add(botonPanelBuscarP);

        return panelSuperior;
    }

    private JPanel pCardLayout() {
        panelCL.setLayout(cardLayout);
        panelCL.add(panelRegistrar(), "panelReg");
        panelCL.add(panelBuscar(), "panelBuscar");

        return panelCL;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "botonReg":
                cardLayout.show(panelCL, "panelReg");
                if (panelRegistrar.isShowing()) {
                    botonPanelAnadir.setEnabled(true);
                } else {
                    botonPanelAnadir.setEnabled(false);
                }
                break;

            case "botonPanelBuscarP":
                cardLayout.show(panelCL, "panelBuscar");

                modeloComboBox.removeAllElements();
                modeloComboBox.setSelectedItem("Selecciona un usuario");
                for(int i = 0; i < listaPersonas.size();i++){
                    modeloComboBox.addElement(listaPersonas.get(i));
                }

                cajaComboPersonas.setModel(modeloComboBox);

                if (panelBuscar.isShowing()) {
                    botonPanelAnadir.setEnabled(false);
                } else {
                    botonPanelAnadir.setEnabled(true);
                }
                break;

            case "botonAnadir":
                String nombre = textoNombre.getText();
                String dni = textoDNI.getText();
                int notaDI = (int) modeloSDi.getValue();
                int notaPMDM = (int) modeloSPmdm.getValue();
                int notaPSP = (int) modeloSPsp.getValue();
                int notaAD = (int) modeloSAd.getValue();

                boolean esta = false;
                for (int i = 0; i < listaPersonas.size(); i++) {
                    if (listaPersonas.get(i).getDni().equals(dni)) {
                        esta = true;
                        break;
                    }
                }
                if (!esta && !textoDNI.getText().equals("") && !textoNombre.getText().equals("")) {
                    Persona p = new Persona(nombre, dni, notaDI, notaPMDM, notaPSP, notaAD);
                    listaPersonas.add(p);
                }

                textoNombre.setText("");
                textoDNI.setText("");
                spinnerDi.setValue(0);
                spinnerPmdm.setValue(0);
                spinnerPsp.setValue(0);
                spinnerAd.setValue(0);

                break;
        }
    }

    private JPanel panelRegistrar() {
        panelRegistrar.setLayout(new GridLayout(7, 2));
        panelRegistrar.add(nombre);
        panelRegistrar.add(textoNombre);
        panelRegistrar.add(dni);
        panelRegistrar.add(textoDNI);
        panelRegistrar.add(notaDI);
        panelRegistrar.add(spinnerDi);
        panelRegistrar.add(notaPMDM);
        panelRegistrar.add(spinnerPmdm);
        panelRegistrar.add(notaPSP);
        panelRegistrar.add(spinnerPsp);
        panelRegistrar.add(notaAD);
        panelRegistrar.add(spinnerAd);
        return panelRegistrar;
    }


    public void confiConstraint(Integer posX, 
            Integer posY, 
            Integer tX, 
            Integer tY, 
            Double weightX, 
            Double weightY, 
            Integer anchor, 
            Integer fill, 
            Component componente, 
            JPanel panel) {

        gridBagCon.gridx = posX;
        gridBagCon.gridy = posY;
        gridBagCon.gridwidth = tX;
        gridBagCon.gridheight = tY;
        gridBagCon.weightx = weightX;
        gridBagCon.weighty = weightY;
        gridBagCon.anchor = anchor;
        gridBagCon.fill = fill;
        panel.add(componente, gridBagCon);

    }

    private JPanel panelBuscar() {
        panelBuscar.setLayout(new GridBagLayout());
        confiConstraint(0, 0, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER, GridBagConstraints.CENTER, buscarLabel, panelBuscar);
        confiConstraint(1, 0, 2, 1, 1.0, 0.5, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, cajaComboPersonas, panelBuscar);
        confiConstraint(0, 1, 3, 1, 0.0, 0.5, GridBagConstraints.CENTER, GridBagConstraints.CENTER, labelMedia, panelBuscar);
        return panelBuscar;
    }

    public double calcularMedia(Persona p) {
        double total = Double.valueOf(p.getNotaAD() + p.getNotaDI() + p.getNotaPMDM() + p.getNotaPSP());
        return total / 4;
    }

}
