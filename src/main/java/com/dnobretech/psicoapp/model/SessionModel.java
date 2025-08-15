package com.dnobretech.psicoapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id", nullable = false)
    private PacienteModel paciente;

    @Column(name = "data_sessao", nullable = false)
    private LocalDate dataSessao;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "duracao_minutos")
    private Integer duracaoMinutos;

    @Column(name = "titulo_sessao")
    private String tituloSessao;

    @Column(name = "notas_agendamento", columnDefinition = "TEXT")
    private String notasAgendamento;

    @Column(name = "notas_internas", columnDefinition = "TEXT")
    private String notasInternas;

    @Column(name = "tipo_sessao")
    private String tipoSessao;

    @Column(name = "status_sessao")
    private String statusSessao;

    @Column(name = "valor_sessao")
    private BigDecimal valorSessao;

    @Column(name = "recorrencia")
    private String recorrencia;
}
