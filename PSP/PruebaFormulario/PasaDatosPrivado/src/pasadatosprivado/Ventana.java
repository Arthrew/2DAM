/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasadatosprivado;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario DAM 2
 */
public class Ventana extends JFrame implements ActionListener{
    
    Container container;
    CardLayout cardLayout;
    
    Panel1 panel1;
    Panel2 panel2;
    JMenuBar barra;
    JMenu menu;
    JMenuItem itemUno,itemDos;
    
    Ventana(){
        initGUI();
    }
    
    private void initGUI() {
        instancias();
        configurarMenu();
        configurarContainer();
        acciones();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void instancias(){
            panel1 = new Panel1();
            panel2 = new Panel2();
            menu = new JMenu();
            barra = new JMenuBar();
            itemUno = new JMenuItem("Agregar");
            itemDos = new JMenuItem("Listar");
            container = this.getContentPane();
            cardLayout = new CardLayout();
    }

    private void configurarMenu() {
        barra.add(menu);
        menu.add(itemUno);
        menu.add(itemDos);
        this.setJMenuBar(barra);
    }

    private void configurarContainer() {
        container.setLayout(cardLayout);
        container.add(panel1,"panel1");
        container.add(panel2,"panel2");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == itemUno){
                cardLayout.show(container,"panel1");
            }else if(e.getSource() == itemDos){
                cardLayout.show(container,"panel2");
            }
    }

    private void acciones() {
        itemUno.addActionListener(this);
        itemUno.addActionListener(this);
                
    }
    
}
