package br.com.turbopark.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "TB_VAGAS")
@Table(name = "TB_VAGAS")
public class VagasEntity {

    @Id
    private Long id;

    @Column(nullable = true)
    private String bloco;

    @Column
    private String status;

    @Column
    private Long numeroVaga;

    @Column
    private boolean coberta;


}
