package com.dio.live.model;

import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;

}