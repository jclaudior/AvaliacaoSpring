package br.com.rdevs.avaliacao.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="tb_modulo")
public class ModuloEntity {

    @Id
    @Column(name="ds_nome")
    private String dsNome;

    @Column(name="ds_instrutor_titular")
    private String dsInstrutorTitular;

    @Column(name="ds_instrutor_auxiliar")
    private String dsInstrutorAuxiliar;

    @Column(name="dt_inicio")
    private Date dtInicio;

}
