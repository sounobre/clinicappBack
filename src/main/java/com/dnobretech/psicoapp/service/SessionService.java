package com.dnobretech.psicoapp.service;

import com.dnobretech.psicoapp.dto.SessionRequestDTO;
import com.dnobretech.psicoapp.dto.SessionResponseDTO;

import java.util.List;
import java.util.Optional;

public interface SessionService {
    List<SessionResponseDTO> findAll();
    Optional<SessionResponseDTO> findById(Long id);
    List<SessionResponseDTO> findByPacienteId(Long pacienteId);
    SessionResponseDTO save(SessionRequestDTO sessionRequestDTO);
    Optional<SessionResponseDTO> update(Long id, SessionRequestDTO sessionRequestDTO);
    boolean deleteById(Long id);
}
