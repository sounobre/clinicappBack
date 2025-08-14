package com.dnobretech.psicoapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity // Marca esta classe como uma entidade JPA (uma tabela no banco)
@Table(name = "pacientes") // Define o nome da tabela
@Data // Anotação do Lombok que cria getters, setters, toString, etc.
@NoArgsConstructor // Lombok: cria um construtor sem argumentos
@AllArgsConstructor // Lombok: cria um construtor com todos os argumentos
public class PacienteModel {

    @Id // Marca este campo como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco de dados irá gerar o valor do ID automaticamente
    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    @Column(nullable = false)
    private String nomeCompleto;

    @NotBlank(message = "CPF é obrigatório.")
    @Size(min = 11, max = 14, message = "CPF deve ter entre 11 e 14 caracteres.")
    @Column(nullable = false, unique = true)
    private String cpf;

    @NotNull(message = "Data de nascimento é obrigatória.")
    @Column(nullable = false)
    private LocalDate dataNascimento;

    private String nomeSocial;
    private String genero;
    private String pronomes;
    private String rg;

    @NotBlank(message = "Telefone é obrigatório.")
    private String telefonePrincipal;

    @NotBlank(message = "Email é obrigatório.")
    @Email(message = "Email inválido.")
    private String emailPrincipal;

    // Campos de endereço
    private String enderecoCep;
    private String enderecoRua;
    private String enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoEstado;

    // Campos de contato de emergência
    private String contatoEmergenciaNome;
    private String contatoEmergenciaParentesco;
    private String contatoEmergenciaTelefone;

    // Informações adicionais
    private String comoConheceu;
    @Column(columnDefinition = "TEXT")
    private String campoObservacoesIniciais;

    @NotNull
    private Boolean consentimentoLgpd;

    // Podemos adicionar outros campos que vimos no frontend, como o status
    private String status = "Ativo";
}

