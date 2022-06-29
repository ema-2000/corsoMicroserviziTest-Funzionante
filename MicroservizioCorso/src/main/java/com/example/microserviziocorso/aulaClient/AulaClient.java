package com.example.microserviziocorso.aulaClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "aula", url = "http://localhost:8083/api/aula")
public interface AulaClient {

         @GetMapping(value = "/getNomeNumeroById")
        public String getNomeNumeroAula(@RequestParam Long id);

}
