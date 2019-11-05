/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontrabajadores;

/**
 *
 * @author Usuario DAM 2
 */
public class Asalariado extends Trabajador{
    
    int pagas;
    

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int pagas) {
        super(nombre, apellido, dni, sueldo);
        /*
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        */
        this.pagas = pagas;
    }

    @Override
    public void calcularSalario() {
        sueldoMes = this.sueldo / this.pagas;
    }
    
    
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("Pagas %d \n",pagas);
    }
    
}
