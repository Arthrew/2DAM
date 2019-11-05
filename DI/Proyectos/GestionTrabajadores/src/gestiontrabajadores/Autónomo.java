
package gestiontrabajadores;

/**
 *
 * @author Usuario DAM 2
 */
public class Autónomo extends Trabajador {
    
    public Autónomo(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    @Override
    public void calcularSalario() {
        sueldoMes = sueldo/12;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
    
}
