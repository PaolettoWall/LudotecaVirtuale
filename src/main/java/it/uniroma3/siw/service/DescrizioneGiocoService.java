package it.uniroma3.siw.service;

import org.springframework.beans.factory.annotation.Autowired;

import it.uniroma3.siw.repository.DescrizioneGiocoRepository;

public class DescrizioneGiocoService {

    // Iniettiamo il repository DescrizioneGiocoRepository per accedere ai metodi CRUD
    // e ad altre funzionalità del repository
    // per gestire gli oggetti DescrizioneGioco nel database
    // private DescrizioneGiocoRepository descrizioneGiocoRepository;
    @Autowired
    private DescrizioneGiocoRepository descrizioneGiocoRepository;
}
