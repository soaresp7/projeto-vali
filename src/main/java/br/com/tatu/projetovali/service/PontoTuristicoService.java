package br.com.tatu.projetovali.service;

import br.com.tatu.projetovali.database.model.PontoTuristicoEntity;
import br.com.tatu.projetovali.database.repository.PontoTuristicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PontoTuristicoService {
    private final PontoTuristicoRepository pontoTuristicoRepository;


    public List<PontoTuristicoEntity> findAll(){
        return pontoTuristicoRepository.findAll();
    }



}
