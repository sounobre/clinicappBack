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
    private String telefonePrincipal;
    private String emailPrincipal;
    private String status;
    private LocalDate dataNascimento;
}