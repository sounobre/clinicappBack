package com.dnobretech.psicoapp.mapper;

import com.dnobretech.psicoapp.dto.SessionRequestDTO;
import com.dnobretech.psicoapp.dto.SessionResponseDTO;
import com.dnobretech.psicoapp.model.PacienteModel;
import com.dnobretech.psicoapp.model.SessionModel;

public class SessionMapper {

    public static SessionModel toEntity(SessionRequestDTO dto, PacienteModel paciente) {
        return SessionModel.builder()
                .paciente(paciente)
                .dataSessao(dto.getDataSessao())
                .horaInicio(dto.getHoraInicio())
                .duracaoMinutos(dto.getDuracaoMinutos())
                .tituloSessao(dto.getTituloSessao())
                .notasAgendamento(dto.getNotasAgendamento())
                .notasInternas(dto.getNotasInternas())
                .tipoSessao(dto.getTipoSessao())
                .statusSessao(dto.getStatusSessao())
                .valorSessao(dto.getValorSessao())
                .recorrencia(dto.getRecorrencia())
                .build();
    }

    public static SessionResponseDTO toResponseDTO(SessionModel session) {
        return SessionResponseDTO.builder()
                .id(session.getId())
                .pacienteId(session.getPaciente().getId())
                .dataSessao(session.getDataSessao())
                .horaInicio(session.getHoraInicio())
                .duracaoMinutos(session.getDuracaoMinutos())
                .tituloSessao(session.getTituloSessao())
                .notasAgendamento(session.getNotasAgendamento())
                .notasInternas(session.getNotasInternas())
                .tipoSessao(session.getTipoSessao())
                .statusSessao(session.getStatusSessao())
                .valorSessao(session.getValorSessao())
                .recorrencia(session.getRecorrencia())
                .build();
    }
}
