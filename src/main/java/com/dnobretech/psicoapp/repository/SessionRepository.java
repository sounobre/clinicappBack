package com.dnobretech.psicoapp.repository;

import com.dnobretech.psicoapp.model.SessionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<SessionModel, Long> {
    List<SessionModel> findByPacienteId(Long pacienteId);
}
