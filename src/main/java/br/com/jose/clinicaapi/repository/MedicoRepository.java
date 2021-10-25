package br.com.jose.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}