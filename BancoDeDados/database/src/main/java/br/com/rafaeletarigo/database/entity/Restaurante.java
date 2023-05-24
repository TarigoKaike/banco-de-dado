package br.com.rafaeletarigo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurante {
@Id
    private short id;
    private String nome_restaurante;
    private String telefone_restaurante;
    private String endereco;
    
}
