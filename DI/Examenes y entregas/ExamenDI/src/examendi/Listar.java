/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendi;

import java.util.ArrayList;
import java.util.Enumeration;

public class Listar {

    ArrayList<Llamadas> listado = new ArrayList<Llamadas>();

    public Listar() {
        if (!listado.isEmpty()) {
            for (Llamadas a : listado) {
                System.out.printf(a.getNumero_origen(),a.getNumero_destino());
            }
        
    }

    public void agregar(Llamadas elemento) {
        listado.add(new Llamadas(0, 0, 0));
    }

     public void listado() {
        Enumeration<Llamadas> e = listado.;
        while (e.hasMoreElements()) {
            Llamadas elemento = e.nextElement();
            System.out.println(elemento);

        }

    }

}
