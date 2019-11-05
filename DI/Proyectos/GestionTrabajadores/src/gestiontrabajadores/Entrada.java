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
public class Entrada {
    
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        Trabajador autonomo = new Autónomo("NAut", "AAut", "123", 1);
        Trabajador asalariado = new Asalariado("Nas", "AAs", "1234", 1, 15);
        empresa.registrarTrabajador(autonomo);
        empresa.registrarTrabajador(asalariado);
        
        Socio socio = new Socio();
    }
    
}
