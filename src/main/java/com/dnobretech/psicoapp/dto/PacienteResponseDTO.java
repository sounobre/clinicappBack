package com.dnobretech.psicoapp.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PacienteResponseDTO {
    private Long id;
    private String nomeCompleto;
    private String telefonePrincipal;
    private String emailPrincipal;
    private String status;
    private LocalDate dataNascimento;
}