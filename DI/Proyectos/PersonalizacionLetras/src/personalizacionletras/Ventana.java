package personalizacionletras;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Ventana extends JFrame implements ItemListener {

    Container container;
    JComboBox comboLetra, comboTamaño, comboTipo, comboEstilo;
    DefaultComboBoxModel modeloLetra, modeloTamanio, modeloTipo, modeloEstilo;
    JLabel lb_Letra, lb_Tamaño, lb_Tipo, lb_Estilo;

    public void initGUI() {
        intancias();
        rellenarLetras();
        rellenarTamaño();
        rellenarTipo();
        configurarPanel();
        acciones();
        this.setSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        cambiarLetras();
    }

    private void intancias() {
        modeloLetra = new DefaultComboBoxModel();
        modeloTamanio = new DefaultComboBoxModel();
        modeloTipo = new DefaultComboBoxModel();
        modeloEstilo = new DefaultComboBoxModel();

        comboLetra = new JComboBox(modeloLetra);
        comboTamaño = new JComboBox(modeloTamanio);
        comboTipo = new JComboBox(modeloTipo);
        comboEstilo = new JComboBox(modeloEstilo);

        lb_Letra = new JLabel("Letra");
        lb_Tamaño = new JLabel("Tamaño");
        lb_Tipo = new JLabel("Tipo");
        lb_Estilo = new JLabel("Estilo");

    }

    private void acciones() {
        comboLetra.addItemListener(this);
        comboTamaño.addItemListener(this);
    }

    private void configurarPanel() {
        this.setLayout(new GridLayout(4, 2));
        this.add(lb_Letra);
        this.add(comboLetra);
        this.add(lb_Tamaño);
        this.add(comboTamaño);
        this.add(lb_Tipo);
        this.add(comboTipo);
        this.add(lb_Estilo);
        this.add(comboEstilo);
    }

    private void rellenarLetras() {
        Font[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

        for (Font item : fuentes) {
            modeloLetra.addElement(item.getName());
        }
    }

    private void rellenarTamaño() {
        for (int i = 8; i <= 50; i++) {
            modeloTamanio.addElement(i);
        }
    }

    private void rellenarTipo() {
        modeloTipo.addElement("NORMAL");
        modeloTipo.addElement("CURSIVA");
        modeloTipo.addElement("BOLD");
    }

    private void cambiarLetras() {
        Font fuente = new Font((String) modeloLetra.getSelectedItem(),
                comboTipo.getSelectedIndex(), (int) modeloTamanio.getSelectedItem());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboLetra) {
            cambiarLetras();
        } else if (e.getSource() == comboTamaño) {

            cambiarLetras();
        }
    }

}
