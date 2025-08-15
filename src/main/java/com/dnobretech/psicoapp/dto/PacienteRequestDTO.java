package com.dnobretech.psicoapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PacienteRequestDTO {

    @NotBlank(message = "O nome é obrigatório.")
    private String nomeCompleto;

    @NotBlank(message = "CPF é obrigatório.")
    @Size(min = 11, max = 14, message = "CPF deve ter entre 11 e 14 caracteres.")
    private String cpf;

    @NotNull(message = "Data de nascimento é obrigatória.")
    private LocalDate dataNascimento;
    private String nomeSocial;
    private String genero;
    private String pronomes;
    private String rg;

    // Campos de endereço
    private String enderecoCep;
    private String enderecoRua;
    private String enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoEstado;

    // Contato de emergência
    private String contatoEmergenciaNome;
    private String contatoEmergenciaParentesco;
    private String contatoEmergenciaTelefone;

    // Informações adicionais
    private String comoConheceu;
    private String campoObservacoesIniciais;
    private String status;

    @NotBlank(message = "Telefone é obrigatório.")
    private String telefonePrincipal;

    @NotBlank(message = "Email é obrigatório.")
    @Email(message = "Email inválido.")
    private String emailPrincipal;

    @NotNull(message = "O consentimento LGPD é obrigatório.")
    private Boolean consentimentoLgpd;
}
