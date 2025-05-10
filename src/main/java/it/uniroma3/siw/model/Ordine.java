package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ordine {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)  
    private Integer numeroOrdine;
    private LocalDate dataOrdine;
    
    public Ordine() {
    }

    public Ordine(Integer numeroOrdine, LocalDate dataOrdine, float totale) {
        this.numeroOrdine = numeroOrdine;
        this.dataOrdine = dataOrdine;
    }

    /*l'oggetto Cliente associato non verrà caricato
    immediatamente quando viene caricato un oggetto Ordine.
    Verrà invece caricato solo quando è effettivamente
    necessario (ad esempio, quando si accede al campo cliente)
    STRATEGIA LAZY = PIGRO*/
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;
    
    //giustamente cascade, un ordine è CERTAMENTE composto da righe qui sono sicuro ci vada
    @OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
    private List<RigaOrdine> righe = new ArrayList<>();

    // Metodo per calcolare il totale
  public double getTotale(){
    double totale = 0.0;
    //per ogni riga moltiplico il prezzo unitario * la quantità
    for(RigaOrdine rigaCorrente : this.righe){
        totale = totale + (rigaCorrente.getPrezzoUnitario() * rigaCorrente.getQuantita());
    }
    return totale;
  }


    public Integer getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(Integer numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(LocalDate dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    
    
}
