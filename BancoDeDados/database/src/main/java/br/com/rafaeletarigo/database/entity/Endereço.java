package br.com.rafaeletarigo.database.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Endereço implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private short id;
    @Column(nullable = false, length = 22)
    private String estado;
    @Column(nullable = false, length = 20)
    private String cidade;
    @Column(nullable = false, length = 20)
    private String bairro;
    @Column(nullable = false, length = 20)
    private String rua;
    @Column(nullable = false, length = 20, unique = true)
    private String numero;
    


    public short getId() {
        return id;
    }
    public void setId(short id) {
        this.id = id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}
