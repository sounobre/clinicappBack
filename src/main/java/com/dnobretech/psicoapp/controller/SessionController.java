package com.dnobretech.psicoapp.controller;

import com.dnobretech.psicoapp.dto.SessionRequestDTO;
import com.dnobretech.psicoapp.dto.SessionResponseDTO;
import com.dnobretech.psicoapp.service.SessionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/sessions")
    public List<SessionResponseDTO> getAllSessions() {
        return sessionService.findAll();
    }

    @GetMapping("/sessions/{id}")
    public ResponseEntity<SessionResponseDTO> getSessionById(@PathVariable Long id) {
        return sessionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/patients/{patientId}/sessions")
    public List<SessionResponseDTO> getSessionsByPatient(@PathVariable Long patientId) {
        return sessionService.findByPacienteId(patientId);
    }

    @PostMapping("/sessions")
    public ResponseEntity<SessionResponseDTO> createSession(@Valid @RequestBody SessionRequestDTO sessionRequestDTO) {
        SessionResponseDTO saved = sessionService.save(sessionRequestDTO);
        return ResponseEntity.status(201).body(saved);
    }

    @PutMapping("/sessions/{id}")
    public ResponseEntity<SessionResponseDTO> updateSession(@PathVariable Long id,
                                                            @Valid @RequestBody SessionRequestDTO sessionRequestDTO) {
        return sessionService.update(id, sessionRequestDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/sessions/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable Long id) {
        if (sessionService.deleteById(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
