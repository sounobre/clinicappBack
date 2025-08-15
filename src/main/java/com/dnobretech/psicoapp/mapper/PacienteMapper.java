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
                .cpf(paciente.getCpf())
                .dataNascimento(paciente.getDataNascimento())
                .nomeSocial(paciente.getNomeSocial())
                .genero(paciente.getGenero())
                .pronomes(paciente.getPronomes())
                .rg(paciente.getRg())
                .enderecoCep(paciente.getEnderecoCep())
                .enderecoRua(paciente.getEnderecoRua())
                .enderecoNumero(paciente.getEnderecoNumero())
                .enderecoComplemento(paciente.getEnderecoComplemento())
                .enderecoBairro(paciente.getEnderecoBairro())
                .enderecoCidade(paciente.getEnderecoCidade())
                .enderecoEstado(paciente.getEnderecoEstado())
                .contatoEmergenciaNome(paciente.getContatoEmergenciaNome())
                .contatoEmergenciaParentesco(paciente.getContatoEmergenciaParentesco())
                .contatoEmergenciaTelefone(paciente.getContatoEmergenciaTelefone())
                .comoConheceu(paciente.getComoConheceu())
                .campoObservacoesIniciais(paciente.getCampoObservacoesIniciais())
                .status(paciente.getStatus())
                .telefonePrincipal(paciente.getTelefonePrincipal())
                .emailPrincipal(paciente.getEmailPrincipal())
                .consentimentoLgpd(paciente.getConsentimentoLgpd())
                .build();
    }
}
