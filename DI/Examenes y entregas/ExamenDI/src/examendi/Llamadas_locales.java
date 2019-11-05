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
public class Llamadas_locales extends Llamadas{
    
    int coste;

    public Llamadas_locales(int coste, float numero_origen, float numero_destino, float duracion) {
        super(numero_origen, numero_destino, duracion);
        this.coste = coste;
        
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    
    
    
}
