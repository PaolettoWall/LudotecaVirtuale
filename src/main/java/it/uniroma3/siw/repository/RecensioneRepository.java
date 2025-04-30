package it.uniroma3.siw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.siw.model.Recensione;
@Repository
public interface RecensioneRepository extends CrudRepository<Recensione, Long> {
    // Non sono necessarie query aggiuntive per ora
    // Si possono aggiungere metodi personalizzati se necessario in futuro

}
