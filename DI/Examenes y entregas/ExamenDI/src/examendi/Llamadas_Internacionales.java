/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendi;

/**
 *
 * @author Usuario DAM 2
 */
public class Llamadas_Internacionales extends Llamadas{
    
    String franja_destino;
    
    public Llamadas_Internacionales(String franja_destino, float numero_origen, float numero_destino, float duracion) {
        super(numero_origen, numero_destino, duracion);
        this.franja_destino = franja_destino;
    }

    public String getFranja_destino() {
        return franja_destino;
    }

    public void setFranja_destino(String franja_destino) {
        this.franja_destino = franja_destino;
    }
    
}
