/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendi;

import java.io.Serializable;

/**
 *
 * @author Usuario DAM 2
 */
public class Llamadas implements Serializable{
    
    float numero_origen, numero_destino, duracion;

    public Llamadas(float numero_origen, float numero_destino, float duracion) {
        this.numero_origen = numero_origen;
        this.numero_destino = numero_destino;
        this.duracion = duracion;
    }

    public float getNumero_origen() {
        return numero_origen;
    }

    public void setNumero_origen(float numero_origen) {
        this.numero_origen = numero_origen;
    }

    public float getNumero_destino() {
        return numero_destino;
    }

    public void setNumero_destino(float numero_destino) {
        this.numero_destino = numero_destino;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    
    
}
