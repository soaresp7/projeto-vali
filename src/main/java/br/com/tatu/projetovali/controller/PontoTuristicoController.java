package br.com.tatu.projetovali.controller;


import br.com.tatu.projetovali.database.model.PontoTuristicoEntity;
import br.com.tatu.projetovali.dto.PontoTuristicoDto;
import br.com.tatu.projetovali.service.PontoTuristicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/pontoturistico")
@RequiredArgsConstructor
@Validated
public class PontoTuristicoController {


    private final PontoTuristicoService PontoTuristicoService;


@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public void savePonto(  @RequestBody PontoTuristicoDto pt){
    PontoTuristicoService.savePonto(pt);
}


@GetMapping("/nome/{nome}")
@ResponseStatus(HttpStatus.OK)
    public PontoTuristicoEntity getfindByNome(@PathVariable String nome){
    return  PontoTuristicoService.getfindByNome(nome);
}




@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable Integer id){
          PontoTuristicoService.delete(id);
    }


@DeleteMapping("/{nome}")
@ResponseStatus(HttpStatus.NO_CONTENT)
    public void deteBynome(@PathVariable String nome){
    PontoTuristicoService.deleteByNome(nome);
}






}
