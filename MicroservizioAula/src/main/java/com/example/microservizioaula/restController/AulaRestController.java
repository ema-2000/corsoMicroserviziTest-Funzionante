package com.example.microservizioaula.restController;

import com.example.microservizioaula.entity.Aula;
import com.example.microservizioaula.service.AulaService;
import com.example.microservizioaula.entity.Aula;
import com.example.microservizioaula.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value="api/aula")
public class AulaRestController {

    @Autowired
    AulaService aulaService;

    @GetMapping(value="getNomeNumeroById")
    public String getNomeNumeroById(@RequestParam Long id){

        return aulaService.getNomeCognomeById(id);
    }

    @GetMapping(value = "getAula")
    public List<Aula> findAll(){
        return aulaService.findAll();
    }

    @PostMapping(value="addAula")
    public String addAula(@RequestBody Aula aula){
        aulaService.save(aula);
        return "Aula salvata";
    }

    @DeleteMapping(value="deleteAula")
    public String deleteAula(@RequestBody Aula aula){
        aulaService.deleteById((long) aula.getId());
        return "Aula eliminata";
    }

    @GetMapping(value="findAula")
    public Optional<Aula> findAula(@RequestBody Aula id){

        return aulaService.findById(id.getId());
    }

    @PutMapping(value="updateAula")
    public String updateAula(@RequestBody Aula aula){

        if((Object)aulaService.findById(aula.getId())!=null && aula.getId()!=null)
            aulaService.save(aula);
        return "aula_modificata";
    }
}