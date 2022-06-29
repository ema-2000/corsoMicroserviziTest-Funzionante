package com.example.microservizioaula.entity;
import javax.persistence.*;

@Entity
public class Aula {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="id",nullable = false)
        private long id;

        @Column
        private String numeroAula;

        @Column
        private String nomeAula;

        public Long getId() {
            return this.id;
        }

        public String getNomeAula() {
            return this.nomeAula;
        }

        public String getNumeroAula() {
            return this.numeroAula;
        }
}


