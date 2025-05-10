package it.uniroma3.siw.service;

public class OrdineService{
    // Iniettiamo il repository OrdineRepository per accedere ai metodi CRUD
    // e ad altre funzionalità del repository
    // per gestire gli oggetti Ordine nel database
    // private OrdineRepository ordineRepository;

    @Autowired
    private OrdineRepository ordineRepository;
}
