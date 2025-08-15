package com.dnobretech.psicoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PacienteResponseDTO {
    private Long id;
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String nomeSocial;
    private String genero;
    private String pronomes;
    private String rg;
    private String enderecoCep;
    private String enderecoRua;
    private String enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoEstado;
    private String contatoEmergenciaNome;
    private String contatoEmergenciaParentesco;
    private String contatoEmergenciaTelefone;
    private String comoConheceu;
    private String campoObservacoesIniciais;
    private String status;
    private String telefonePrincipal;
    private String emailPrincipal;
    private Boolean consentimentoLgpd;
}