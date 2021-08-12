package com.dio.live.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Localidade {
  @Id
    private long id;
  @ManyToOne
    private NiveldeAcesso niveldeAcesso;
    private String descricao;
}
