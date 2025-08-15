package com.dnobretech.psicoapp.service.impl;

import com.dnobretech.psicoapp.dto.PacienteRequestDTO;
import com.dnobretech.psicoapp.dto.PacienteResponseDTO;
import com.dnobretech.psicoapp.mapper.PacienteMapper;
import com.dnobretech.psicoapp.model.PacienteModel;
import com.dnobretech.psicoapp.repository.PacienteRepository;
import com.dnobretech.psicoapp.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // Marca a classe como um componente de serviço (lógica de negócio)
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Page<PacienteResponseDTO> findAll(Pageable pageable) {
        var p = pacienteRepository.findAll(pageable)
                .map(PacienteMapper::toResponseDTO);
        return p;
    }

    @Override
    public Optional<PacienteResponseDTO> findById(Long id) {
        return pacienteRepository.findById(id)
                .map(PacienteMapper::toResponseDTO);
    }

    @Override
    public PacienteResponseDTO save(PacienteRequestDTO pacienteRequestDTO) {
        PacienteModel paciente = PacienteMapper.toEntity(pacienteRequestDTO);
        PacienteModel savedPaciente = pacienteRepository.save(paciente);
        return PacienteMapper.toResponseDTO(savedPaciente);
    }

    @Override
    public Optional<PacienteResponseDTO> update(Long id, PacienteRequestDTO pacienteRequestDTO) {
        return pacienteRepository.findById(id)
                .map(pacienteExistente -> {
                    PacienteModel pacienteAtualizado = PacienteMapper.toEntity(pacienteRequestDTO);
                    pacienteAtualizado.setId(pacienteExistente.getId());
                    PacienteModel updatedPaciente = pacienteRepository.save(pacienteAtualizado);
                    return PacienteMapper.toResponseDTO(updatedPaciente);
                });
    }

    @Override
    public boolean deleteById(Long id) {
        if (pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}