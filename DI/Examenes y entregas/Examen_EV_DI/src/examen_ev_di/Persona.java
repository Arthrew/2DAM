
package examen_ev_di;


public class Persona {
    private String nombre;
    private String apellido;
    private String matricula;
    private int notaDI;
    private int notaPMDM;
    private int notaPSP;
    private int notaAD;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String matricula, int notaDI, int notaPMDM, int notaPSP, int notaAD) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.notaDI = notaDI;
        this.notaPMDM = notaPMDM;
        this.notaPSP = notaPSP;
        this.notaAD = notaAD;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNotaDI() {
        return notaDI;
    }

    public void setNotaDI(int notaDI) {
        this.notaDI = notaDI;
    }

    public int getNotaPMDM() {
        return notaPMDM;
    }

    public void setNotaPMDM(int notaPMDM) {
        this.notaPMDM = notaPMDM;
    }

    public int getNotaPSP() {
        return notaPSP;
    }

    public void setNotaPSP(int notaPSP) {
        this.notaPSP = notaPSP;
    }

    public int getNotaAD() {
        return notaAD;
    }

    public void setNotaAD(int notaAD) {
        this.notaAD = notaAD;
    }
    
    @Override
    public String toString() {
        return this.nombre + " - " + this.matricula;
    }
    
}
