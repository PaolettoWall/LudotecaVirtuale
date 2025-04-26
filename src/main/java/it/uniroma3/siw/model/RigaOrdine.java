package it.uniroma3.siw.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class RigaOrdine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    @Column(nullable = false)
    private double prezzoUnitario;
    @Column(nullable = false)
    private int quantita;


    @ManyToOne(fetch = FetchType.EAGER)
    private Ordine ordine;

    @ManyToOne(fetch = FetchType.EAGER)
    private DescrizioneGioco gioco;

    public RigaOrdine() {
    }

    public RigaOrdine(double prezzoUnitario, int quantita) {
        this.prezzoUnitario = prezzoUnitario;
        this.quantita = quantita;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    public DescrizioneGioco getGioco() {
        return gioco;
    }

    public void setGioco(DescrizioneGioco gioco) {
        this.gioco = gioco;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(prezzoUnitario);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantita;
        result = prime * result + ((ordine == null) ? 0 : ordine.hashCode());
        result = prime * result + ((gioco == null) ? 0 : gioco.hashCode());
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
        RigaOrdine other = (RigaOrdine) obj;
        if (Double.doubleToLongBits(prezzoUnitario) != Double.doubleToLongBits(other.prezzoUnitario))
            return false;
        if (quantita != other.quantita)
            return false;
        if (ordine == null) {
            if (other.ordine != null)
                return false;
        } else if (!ordine.equals(other.ordine))
            return false;
        if (gioco == null) {
            if (other.gioco != null)
                return false;
        } else if (!gioco.equals(other.gioco))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RigaOrdine [prezzoUnitario=" + prezzoUnitario + ", quantita=" + quantita + ", ordine=" + ordine
                + ", gioco=" + gioco + "]";
    }

    

}
