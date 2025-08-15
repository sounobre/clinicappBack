package com.dnobretech.psicoapp.mapper;


import com.dnobretech.psicoapp.dto.PacienteRequestDTO;
import com.dnobretech.psicoapp.dto.PacienteResponseDTO;
import com.dnobretech.psicoapp.model.PacienteModel;

public class PacienteMapper {

    // Converte um RequestDTO para uma Entidade Paciente
    public static PacienteModel toEntity(PacienteRequestDTO dto) {
        return PacienteModel.builder()
                .nomeCompleto(dto.getNomeCompleto())
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .nomeSocial(dto.getNomeSocial())
                .genero(dto.getGenero())
                .pronomes(dto.getPronomes())
                .rg(dto.getRg())
                .enderecoCep(dto.getEnderecoCep())
                .enderecoRua(dto.getEnderecoRua())
                .enderecoNumero(dto.getEnderecoNumero())
                .enderecoComplemento(dto.getEnderecoComplemento())
                .enderecoBairro(dto.getEnderecoBairro())
                .enderecoCidade(dto.getEnderecoCidade())
                .enderecoEstado(dto.getEnderecoEstado())
                .contatoEmergenciaNome(dto.getContatoEmergenciaNome())
                .contatoEmergenciaParentesco(dto.getContatoEmergenciaParentesco())
                .contatoEmergenciaTelefone(dto.getContatoEmergenciaTelefone())
                .comoConheceu(dto.getComoConheceu())
                .campoObservacoesIniciais(dto.getCampoObservacoesIniciais())
                .telefonePrincipal(dto.getTelefonePrincipal())
                .emailPrincipal(dto.getEmailPrincipal())
                .consentimentoLgpd(dto.getConsentimentoLgpd())
                .status(dto.getStatus())
                .build();
    }

    // Converte uma Entidade Paciente para um ResponseDTO
    public static PacienteResponseDTO toResponseDTO(PacienteModel paciente) {
        return PacienteResponseDTO.builder()
                .id(paciente.getId())
                .nomeCompleto(paciente.getNomeCompleto())
                .telefonePrincipal(paciente.getTelefonePrincipal())
                .emailPrincipal(paciente.getEmailPrincipal())
                .status(paciente.getStatus())
                .dataNascimento(paciente.getDataNascimento())
                .build();
    }
}
