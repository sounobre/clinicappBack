package com.dnobretech.psicoapp.service.impl;

import com.dnobretech.psicoapp.dto.SessionRequestDTO;
import com.dnobretech.psicoapp.dto.SessionResponseDTO;
import com.dnobretech.psicoapp.mapper.SessionMapper;
import com.dnobretech.psicoapp.model.PacienteModel;
import com.dnobretech.psicoapp.model.SessionModel;
import com.dnobretech.psicoapp.repository.PacienteRepository;
import com.dnobretech.psicoapp.repository.SessionRepository;
import com.dnobretech.psicoapp.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<SessionResponseDTO> findAll() {
        return sessionRepository.findAll().stream()
                .map(SessionMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SessionResponseDTO> findById(Long id) {
        return sessionRepository.findById(id).map(SessionMapper::toResponseDTO);
    }

    @Override
    public List<SessionResponseDTO> findByPacienteId(Long pacienteId) {
        return sessionRepository.findByPacienteId(pacienteId).stream()
                .map(SessionMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SessionResponseDTO save(SessionRequestDTO sessionRequestDTO) {
        PacienteModel paciente = pacienteRepository.findById(sessionRequestDTO.getPacienteId())
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        SessionModel session = SessionMapper.toEntity(sessionRequestDTO, paciente);
        SessionModel saved = sessionRepository.save(session);
        return SessionMapper.toResponseDTO(saved);
    }

    @Override
    public Optional<SessionResponseDTO> update(Long id, SessionRequestDTO sessionRequestDTO) {
        return sessionRepository.findById(id).map(existing -> {
            PacienteModel paciente = pacienteRepository.findById(sessionRequestDTO.getPacienteId())
                    .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
            SessionModel updated = SessionMapper.toEntity(sessionRequestDTO, paciente);
            updated.setId(existing.getId());
            SessionModel saved = sessionRepository.save(updated);
            return SessionMapper.toResponseDTO(saved);
        });
    }

    @Override
    public boolean deleteById(Long id) {
        if (sessionRepository.existsById(id)) {
            sessionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
