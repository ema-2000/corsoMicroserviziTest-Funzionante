package com.example.microserviziodocente.service;

import com.example.microserviziodocente.entity.Docente;

import java.util.List;
import java.util.Optional;

public interface DocenteService {
    String getNomeCognomeById(Long id);

    public void save(Docente docente);

    public List<Docente> findAll();

    void deleteById(long id);

    Optional<Docente> findById(Long id);
}
