package com.dio.live.model;

import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class TipoData {
    @Id
    private  long id;
    private String descricao;
}
