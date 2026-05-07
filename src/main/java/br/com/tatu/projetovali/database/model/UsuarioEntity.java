package br.com.tatu.projetovali.database.model;

import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public class UsuarioEntity {
    private String nome;
    private String senha;
    private String tipo;





    @ManyToMany(mappedBy = "usuarios")
    private Set<PontoTuristicoEntity> pontosCurtidos = new HashSet<>();

}
