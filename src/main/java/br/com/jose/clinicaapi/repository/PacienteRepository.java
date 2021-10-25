package br.com.jose.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}