package it.uniroma3.siw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Cliente;
import it.uniroma3.siw.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    // Iniettiamo il repository ClienteRepository per accedere ai metodi CRUD
    // e ad altre funzionalità del repository
    // per gestire gli oggetti Cliente nel database
    private ClienteRepository clienteRepository;
}
