package com.dnobretech.psicoapp.service;

import com.dnobretech.psicoapp.dto.PacienteRequestDTO;
import com.dnobretech.psicoapp.dto.PacienteResponseDTO;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    List<PacienteResponseDTO> findAll();
    Optional<PacienteResponseDTO> findById(Long id);
    PacienteResponseDTO save(PacienteRequestDTO pacienteRequestDTO);
    Optional<PacienteResponseDTO> update(Long id, PacienteRequestDTO pacienteRequestDTO);
    boolean deleteById(Long id);
}
