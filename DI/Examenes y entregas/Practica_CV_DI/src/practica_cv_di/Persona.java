
package practica_cv_di;

/**
 *
 * @author lopez
 */
public class Persona {
    /*
    private String nombre;
    private String direccion;
    private String dni;
    private String estudios;
    private String estado_civil;
    private int telefono;
    private int anios_exp;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String dni, String estudios, String estado_civil, int telefono, int anios_exp) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.estudios = estudios;
        this.estado_civil = estado_civil;
        this.telefono = telefono;
        this.anios_exp = anios_exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnios_exp() {
        return anios_exp;
    }

    public void setAnios_exp(int anios_exp) {
        this.anios_exp = anios_exp;
    }
    
    
    @Override
    public String toString() {
        return this.nombre + " - " + this.dni;
    }
*/
    
     String nombre, apellido;
    int telefono, edad;
    boolean disponibilidad;

    public Persona(String nombre, String apellido, int telefono, int edad, boolean disponibilidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.disponibilidad = disponibilidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return getApellido();
    }
}
