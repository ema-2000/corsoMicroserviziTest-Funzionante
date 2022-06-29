package com.example.microserviziocorso.controller;


import com.example.microserviziocorso.aulaClient.AulaClient;
import com.example.microserviziocorso.corsoDto.CorsoDto;
import com.example.microserviziocorso.docenteClient.DocenteClient;
import com.example.microserviziocorso.entity.Corso;
import com.example.microserviziocorso.service.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/corso")
public class CorsoController {

    @Autowired
    CorsoService corsoService;

    @Autowired
    DocenteClient docenteClient;

    @Autowired
    AulaClient aulaClient;


    @GetMapping(value = "/getAllCorsi")
    public List<Corso> getAllCorsi(){

        return null;
    }


    @PostMapping(value = "/saveCorso")
    public void saveNewCorso(@RequestBody Corso corso, @RequestParam Long idDocente, @RequestParam Long idAula){

               String nomecognome = docenteClient.getNomeCognomeDocente(idDocente);
               String nomenumero = aulaClient.getNomeNumeroAula(idAula);

               corso.setNomeCognomeDocente(nomecognome);
               corso.setIdDocente(idDocente);

               corso.setNomeNumeroAula(nomenumero);
               corso.setIdAula(idAula);

               corsoService.saveCorso(corso);
               System.out.println("Corso salvato");
    }

    @GetMapping(value="/getCorso")
    public List<CorsoDto> getCorso(){

        return corsoService.findAll();

    }
}
