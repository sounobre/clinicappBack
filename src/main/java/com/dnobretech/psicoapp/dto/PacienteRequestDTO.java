package com.dnobretech.psicoapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDate;

@Data
public class PacienteRequestDTO {

    @NotBlank(message = "O nome é obrigatório.")
    private String nomeCompleto;

    @NotBlank(message = "CPF é obrigatório.")
    @Size(min = 11, max = 14, message = "CPF deve ter entre 11 e 14 caracteres.")
    private String cpf;

    @NotNull(message = "Data de nascimento é obrigatória.")
    private LocalDate dataNascimento;

    // ... adicione aqui TODOS os outros campos que vêm do formulário, com suas respectivas validações ...

    @NotBlank(message = "Telefone é obrigatório.")
    private String telefonePrincipal;

    @NotBlank(message = "Email é obrigatório.")
    @Email(message = "Email inválido.")
    private String emailPrincipal;

    @NotNull(message = "O consentimento LGPD é obrigatório.")
    private Boolean consentimentoLgpd;
}
