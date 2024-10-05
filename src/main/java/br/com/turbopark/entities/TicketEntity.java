package br.com.turbopark.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketEntity {

    private Long id;

    private Date estrada;

    private Date saida;

    private String manobrista;

    private double valor;

    private String formaPagamento;

}
