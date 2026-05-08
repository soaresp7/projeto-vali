package br.com.tatu.projetovali.database.repository;


import br.com.tatu.projetovali.database.model.Categoria;
import br.com.tatu.projetovali.database.model.PontoTuristicoEntity;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PontoTuristicoRepository extends JpaRepository<PontoTuristicoEntity, Integer> {

List<PontoTuristicoEntity> findAllByCategoria (Categoria categoria);

PontoTuristicoEntity findbynome (String nome);


}
