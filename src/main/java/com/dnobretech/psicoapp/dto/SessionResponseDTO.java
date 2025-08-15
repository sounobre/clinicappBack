package com.dnobretech.psicoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SessionResponseDTO {
    private Long id;
    private Long pacienteId;
    private LocalDate dataSessao;
    private LocalTime horaInicio;
    private Integer duracaoMinutos;
    private String tituloSessao;
    private String notasAgendamento;
    private String notasInternas;
    private String tipoSessao;
    private String statusSessao;
    private BigDecimal valorSessao;
    private String recorrencia;
}
