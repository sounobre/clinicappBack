package com.dnobretech.psicoapp.repository;

import com.dnobretech.psicoapp.model.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Opcional, mas boa prática para indicar que é um componente de acesso a dados
public interface PacienteRepository extends JpaRepository<PacienteModel, Long> {
    // A mágica acontece aqui!
    // JpaRepository já nos dá métodos como save(), findById(), findAll(), deleteById(), etc.
    // Não precisamos escrever nenhuma implementação!
}
