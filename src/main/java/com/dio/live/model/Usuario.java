package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

@Audited
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario catagoriadeusuario;
    private String nome;
    @ManyToOne
    private Empressa empressa;
    @ManyToOne
    private NiveldeAcesso niveldeAcesso;
    @ManyToOne
    private  Jornadatrabalho jornadatrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime iniciojornada;
    private LocalDateTime finaljornada;
}
