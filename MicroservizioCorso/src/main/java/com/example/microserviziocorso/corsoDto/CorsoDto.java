package com.example.microserviziocorso.corsoDto;

import java.util.Date;

public class CorsoDto {
    private String nomeCorso;

    private String nomeCognomeDocente;

    private String nomeNumeroAula;

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }
    public void setNomeCognomeDocente(String nomeCognomeDocente){
        this.nomeCognomeDocente=nomeCognomeDocente;
    }
    public String getNomeCognomeDocente(){
        return this.nomeCognomeDocente;
    }

    public void setNomeNumeroAula(String nomeCognomeDocente){
        this.nomeNumeroAula=nomeCognomeDocente;
    }
    public String getNomeNumeroAula(){
        return this.nomeNumeroAula;
    }


}
