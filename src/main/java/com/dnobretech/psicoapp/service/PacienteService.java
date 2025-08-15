package com.dnobretech.psicoapp.service;

import com.dnobretech.psicoapp.dto.PacienteRequestDTO;
import com.dnobretech.psicoapp.dto.PacienteResponseDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface PacienteService {
    Page<PacienteResponseDTO> findAll(Pageable pageable);
    Optional<PacienteResponseDTO> findById(Long id);
    PacienteResponseDTO save(PacienteRequestDTO pacienteRequestDTO);
    Optional<PacienteResponseDTO> update(Long id, PacienteRequestDTO pacienteRequestDTO);
    boolean deleteById(Long id);
}
