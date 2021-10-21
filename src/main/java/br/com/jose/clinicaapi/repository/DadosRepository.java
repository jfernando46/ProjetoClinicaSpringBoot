package br.com.jose.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long> {

}

