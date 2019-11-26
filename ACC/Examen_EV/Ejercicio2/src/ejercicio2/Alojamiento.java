/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.Serializable;


public class Alojamiento implements Serializable{
    
    private String nombre, localidad,alojamiento;
    private int valoracion;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String localidad, String alojamiento, int valoracion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.alojamiento = alojamiento;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
    
    
}
