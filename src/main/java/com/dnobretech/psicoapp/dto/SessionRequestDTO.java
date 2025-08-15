package com.dnobretech.psicoapp.dto;

import jakarta.validation.constraints.NotNull;
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
public class SessionRequestDTO {

    @NotNull(message = "O paciente é obrigatório.")
    private Long pacienteId;

    @NotNull(message = "A data da sessão é obrigatória.")
    private LocalDate dataSessao;

    @NotNull(message = "A hora de início é obrigatória.")
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
