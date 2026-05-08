package br.com.tatu.projetovali.service;

import br.com.tatu.projetovali.database.model.PontoTuristicoEntity;
import br.com.tatu.projetovali.database.repository.PontoTuristicoRepository;
import br.com.tatu.projetovali.dto.PontoTuristicoDto;
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


   public void savePonto(PontoTuristicoDto pt){
       pontoTuristicoRepository.save(PontoTuristicoEntity.builder()
                       .email(pt.getEmail())
                       .rua(pt.getRua())
                       .bairro(pt.getBairro())
                       .categoria(pt.getCategoria())
                       .descricao(pt.getDescricao())
                       .imagem(pt.getImagem())
                       .horaAbertura(pt.getHoraAbertura())
                       .horaFechamento(pt.getHoraFechamento())

               .build());

   }

    public PontoTuristicoEntity getfindByNome (String nome)
    {
        return pontoTuristicoRepository.findbynome(nome);
    }

    public void delete(Integer id){
        pontoTuristicoRepository.deleteById(id);
    }

    public PontoTuristicoEntity getfindById(Integer id){
        return pontoTuristicoRepository.findById(id).orElse(null);
    }



}
