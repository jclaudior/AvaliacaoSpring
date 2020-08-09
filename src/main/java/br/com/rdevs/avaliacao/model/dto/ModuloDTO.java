package br.com.rdevs.avaliacao.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ModuloDTO {

    private String dsNome;
    private String dsInstrutorTitular;
    private String dsInstrutorAuxiliar;
    private Date dtInicio;
}
