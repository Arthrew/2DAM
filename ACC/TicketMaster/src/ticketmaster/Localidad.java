package ticketmaster;

import java.io.Serializable;


public class Localidad implements Serializable{

    private String localidad;
    private int id;

    public Localidad(String localidad, int id) {
        this.localidad = localidad;
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
