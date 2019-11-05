package ticketmaster;

import java.io.Serializable;


public class Evento implements Serializable{

    private String evento;
    private int id;

    public Evento(String evento, int id) {
        this.evento = evento;
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
