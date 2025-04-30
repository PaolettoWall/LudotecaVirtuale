package it.uniroma3.siw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

}
