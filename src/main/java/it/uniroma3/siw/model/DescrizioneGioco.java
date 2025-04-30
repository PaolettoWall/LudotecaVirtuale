package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.catalog.Catalog;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class DescrizioneGioco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titolo;
    @Column(length = 1000)
    private String descrizione;
    private double prezzo;
    private String piattaforma;
    private String genere;
    private String immagineUrl;

    

    public DescrizioneGioco() {
    }

    

    public DescrizioneGioco(String titolo, String descrizione, double prezzo, String piattaforma, String genere,
            String immagineUrl) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.piattaforma = piattaforma;
        this.genere = genere;
        this.immagineUrl = immagineUrl;
    }



    @ManyToOne(fetch = FetchType.EAGER)
    private Catalogo catalogo;

    //per ora metto eager, voglio che tutte le recensioni di un gioco siano caricate quando
    // apri una pagina descrizione gioco e pronte a essere visualizzate
    @OneToMany(mappedBy = "gioco", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Recensione> recensioni = new ArrayList<>();

    @OneToMany(mappedBy = "gioco", cascade = CascadeType.ALL)
    private List<RigaOrdine> righeOrdine = new ArrayList<>();



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getTitolo() {
        return titolo;
    }



    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }



    public String getDescrizione() {
        return descrizione;
    }



    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }



    public double getPrezzo() {
        return prezzo;
    }



    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }



    public String getPiattaforma() {
        return piattaforma;
    }



    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }



    public String getGenere() {
        return genere;
    }



    public void setGenere(String genere) {
        this.genere = genere;
    }



    public String getImmagineUrl() {
        return immagineUrl;
    }



    public void setImmagineUrl(String immagineUrl) {
        this.immagineUrl = immagineUrl;
    }



    public Catalogo getCatalogo() {
        return catalogo;
    }



    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }



    public List<Recensione> getRecensioni() {
        return recensioni;
    }



    public void setRecensioni(List<Recensione> recensioni) {
        this.recensioni = recensioni;
    }



    public List<RigaOrdine> getRigheOrdine() {
        return righeOrdine;
    }



    public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
        this.righeOrdine = righeOrdine;
    }



    @Override
    public String toString() {
        return "DescrizioneGioco [id=" + id + ", titolo=" + titolo + ", descrizione=" + descrizione + ", prezzo="
                + prezzo + ", piattaforma=" + piattaforma + ", genere=" + genere + "]";
    }

    
}
