package br.com.jose.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}