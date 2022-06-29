package com.example.microservizioaula.service;

import com.example.microservizioaula.entity.Aula;
import com.example.microservizioaula.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServiceImpl implements AulaService{

    @Autowired
    AulaRepository aulaRepo;

    @Override
    public Optional<Aula> findById(Long id){
        return aulaRepo.findById(id);
    }

    @Override
    public List<Aula> findAll(){
        return aulaRepo.findAll();
    }

    @Override
    public void deleteById(Long id){
        aulaRepo.deleteById(id);
    }

    @Override
    public void save(Aula aula){
        aulaRepo.save(aula);
    }

    @Override
    public String getNomeCognomeById(Long id){
        return aulaRepo.getReferenceById(id).getNomeAula()+" "+aulaRepo.getReferenceById(id).getNumeroAula();
    }

}