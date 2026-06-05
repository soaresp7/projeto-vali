package br.com.tatu.projetovali.dto;

import br.com.tatu.projetovali.typeEnum.Categoria;
import lombok.*;

import java.time.LocalTime;
import java.util.List;




@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PontoTuristicoDto {

        private String nome;
        private String descricao;
        private String bairro;
        private String rua;
        private LocalTime horaAbertura;
        private LocalTime horaFechamento;
        private Categoria categoria;
        private Long numeroCurtidas;
        private List<String> telefone;
        private List<String> imagem;
        private List<String> email;









}
