package br.com.tatu.projetovali.database.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
public class UsuarioEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nome;
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;





    @ManyToMany(mappedBy = "usuarios")
    private Set<PontoTuristicoEntity> pontosCurtidos = new HashSet<>();

}
