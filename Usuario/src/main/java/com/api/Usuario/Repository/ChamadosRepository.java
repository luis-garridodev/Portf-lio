package com.api.Usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.Usuario.Models.Chamados;


public interface ChamadosRepository extends JpaRepository<Chamados, Long> {
	 
}

