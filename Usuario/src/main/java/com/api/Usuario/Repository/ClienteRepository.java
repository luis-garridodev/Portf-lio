package com.api.Usuario.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.api.Usuario.Models.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
		 
	}
