package com.dnobretech.psicoapp.mapper;


import com.dnobretech.psicoapp.dto.PacienteRequestDTO;
import com.dnobretech.psicoapp.dto.PacienteResponseDTO;
import com.dnobretech.psicoapp.model.PacienteModel;

public class PacienteMapper {

    // Converte um RequestDTO para uma Entidade Paciente
    public static PacienteModel toEntity(PacienteRequestDTO dto) {
        PacienteModel paciente = new PacienteModel();
        paciente.setNomeCompleto(dto.getNomeCompleto());
        paciente.setCpf(dto.getCpf());
        paciente.setDataNascimento(dto.getDataNascimento());
        paciente.setTelefonePrincipal(dto.getTelefonePrincipal());
        paciente.setEmailPrincipal(dto.getEmailPrincipal());
        paciente.setConsentimentoLgpd(dto.getConsentimentoLgpd());
        // Adicione aqui a conversão dos outros campos do DTO para a entidade
        return paciente;
    }

    // Converte uma Entidade Paciente para um ResponseDTO
    public static PacienteResponseDTO toResponseDTO(PacienteModel paciente) {
        PacienteResponseDTO dto = new PacienteResponseDTO();
        dto.setId(paciente.getId());
        dto.setNomeCompleto(paciente.getNomeCompleto());
        dto.setTelefonePrincipal(paciente.getTelefonePrincipal());
        dto.setEmailPrincipal(paciente.getEmailPrincipal());
        dto.setStatus(paciente.getStatus());
        dto.setDataNascimento(paciente.getDataNascimento());
        return dto;
    }
}
