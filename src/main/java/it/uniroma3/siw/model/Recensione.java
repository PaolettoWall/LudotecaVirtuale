package it.uniroma3.siw.model;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Recensione {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;
    private String testo;   
    private int voto;
    private LocalDate dataRecensione;

    public Recensione() {
    }

    public Recensione(String testo, int voto, LocalDate dataRecensione) {
        this.testo = testo;
        this.voto = voto;
        this.dataRecensione = dataRecensione;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private DescrizioneGioco gioco;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public LocalDate getDataRecensione() {
        return dataRecensione;
    }

    public void setDataRecensione(LocalDate dataRecensione) {
        this.dataRecensione = dataRecensione;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((testo == null) ? 0 : testo.hashCode());
        result = prime * result + voto;
        result = prime * result + ((dataRecensione == null) ? 0 : dataRecensione.hashCode());
        result = prime * result + ((gioco == null) ? 0 : gioco.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Recensione other = (Recensione) obj;
        if (testo == null) {
            if (other.testo != null)
                return false;
        } else if (!testo.equals(other.testo))
            return false;
        if (voto != other.voto)
            return false;
        if (dataRecensione == null) {
            if (other.dataRecensione != null)
                return false;
        } else if (!dataRecensione.equals(other.dataRecensione))
            return false;
        if (gioco == null) {
            if (other.gioco != null)
                return false;
        } else if (!gioco.equals(other.gioco))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Recensione [testo=" + testo + ", voto=" + voto + ", dataRecensione=" + dataRecensione + ", gioco="
                + gioco + ", cliente=" + cliente + "]";
    }   

    

}
