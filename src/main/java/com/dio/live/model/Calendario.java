package com.dio.live.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Calendario {
    @Id
    private  Long id;
    @ManyToOne
    private  TipoData tipoData;
    private  String descricao;
    private  LocalDateTime dataEspecial;


}
