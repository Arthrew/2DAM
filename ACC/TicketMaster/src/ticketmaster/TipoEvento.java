package ticketmaster;

import java.io.Serializable;


public class TipoEvento implements Serializable{

    private String tipoEvento;
    private int id;

    public TipoEvento(String tipoEvento, int id) {
        this.tipoEvento = tipoEvento;
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
