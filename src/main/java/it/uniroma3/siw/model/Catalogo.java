package it.uniroma3.siw.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    

    public Catalogo() {
    }

    

    public Catalogo(String genere, List<DescrizioneGioco> giochi) {
        this.genere = genere;
        this.giochi = giochi;
    }



    @Column(unique = true, nullable = false)
    private String genere; // "horror", "bambini", "famiglia"
    
    @OneToMany(mappedBy = "catalogo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DescrizioneGioco> giochi = new ArrayList<>();

    public void aggiungiGioco(DescrizioneGioco gioco) {
        giochi.add(gioco);
        gioco.setCatalogo(this);
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getGenere() {
        return genere;
    }



    public void setGenere(String genere) {
        this.genere = genere;
    }



    public List<DescrizioneGioco> getGiochi() {
        return giochi;
    }



    public void setGiochi(List<DescrizioneGioco> giochi) {
        this.giochi = giochi;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((genere == null) ? 0 : genere.hashCode());
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
        Catalogo other = (Catalogo) obj;
        if (genere == null) {
            if (other.genere != null)
                return false;
        } else if (!genere.equals(other.genere))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Catalogo [genere=" + genere + "]";
    }    
    
}