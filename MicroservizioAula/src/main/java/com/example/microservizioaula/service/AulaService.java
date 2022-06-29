package com.example.microservizioaula.service;


import com.example.microservizioaula.entity.Aula;

import java.util.List;
import java.util.Optional;

public interface AulaService {

    public Optional<Aula> findById(Long id);

    List<Aula> findAll();

    void deleteById(Long id);

    void save(Aula aula);

    String getNomeCognomeById(Long id);
}
