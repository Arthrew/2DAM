package ticketmaster;

import java.io.Serializable;


public class Recinto implements Serializable{

    private String recintos;
    private int id;

    public Recinto(String recintos, int id) {
        this.recintos = recintos;
        this.id = id;
    }

    public String getRecintos() {
        return recintos;
    }

    public void setRecintos(String recintos) {
        this.recintos = recintos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
