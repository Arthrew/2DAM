package paneles;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PestaniaUno extends JPanel implements ChangeListener {
    
    Container contenedor;

    JRadioButton rUno, rDos, rTres;
    ButtonGroup grupoRadios;
    JLabel titulo,lb_nombre, lb_direccion, lb_telefono, lb_dni;
    JTextField nombre, direccion, dni, telefono;
    JPanel pIZQ, pDCH;
    
    

    public PestaniaUno() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }
    
    

    

    private void configurarPanel() {
        this.setLayout(new BorderLayout());
        this.add(titulo,BorderLayout.NORTH);
        this.add(configIZQ(), BorderLayout.WEST);
        this.add(configDCH(), BorderLayout.EAST);
    }
    
    private void instancias() {
        /*
        rUno = new JRadioButton("opcion1", false);
        rDos = new JRadioButton("opcion2", false);
        rTres = new JRadioButton("opcion3", true);
        grupoRadios = new ButtonGroup();
        grupoRadios.add(rUno);
        grupoRadios.add(rDos);
        grupoRadios.add(rTres);
*/
        pIZQ = new JPanel();
        pDCH = new JPanel();
        titulo = new JLabel("POR FAVOR, RELLENA LOS DATOS DE TU CURRICULUM");
        lb_nombre = new JLabel("Nombre");
        lb_direccion = new JLabel("Direccion");
        lb_telefono = new JLabel("Telefono");
        lb_dni = new JLabel("DNI");
        nombre = new JTextField();
        nombre.setSize(40, 20);
        direccion = new JTextField();
        telefono = new JTextField();
        dni = new JTextField();

    }
    
    private void acciones() {
        /*
        rUno.addChangeListener(this);
        rDos.addChangeListener(this);
        rTres.addChangeListener(this);
        */
    }
    
    private JPanel configIZQ() {
        pIZQ.setLayout(new GridLayout(0,1));
        pIZQ.add(lb_nombre);
        pIZQ.add(nombre);
        pIZQ.add(lb_direccion);
        pIZQ.add(direccion);
        pIZQ.add(lb_telefono);
        pIZQ.add(telefono);
        pIZQ.add(lb_dni);
        pIZQ.add(dni);
        
        return pIZQ;
    }
    
    private JPanel configDCH() {
        pDCH.setLayout(new BorderLayout());

        return pDCH;
    }

    

    @Override
    public void stateChanged(ChangeEvent e) {
    }
}