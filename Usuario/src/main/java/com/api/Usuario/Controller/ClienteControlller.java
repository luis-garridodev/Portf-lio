package com.api.Usuario.Controller;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.Usuario.Dto.ClienteDto;
import com.api.Usuario.Models.Cliente;
import com.api.Usuario.Repository.ClienteRepository;


@RestController
@RequestMapping("/Cliente")
public class ClienteControlller {
@Autowired
public ClienteRepository repository;
@GetMapping
public List<ClienteDto>ListarCliente(){
	return ClienteDto.converter(repository.findAll());
}
@PostMapping
public ResponseEntity<Cliente>CriarCliente(@RequestBody ClienteDto clientedto){
	ModelMapper mapper=new ModelMapper();
	Cliente savecliente=mapper.map(clientedto,Cliente.class);
	
	return  ResponseEntity.ok(repository.save(savecliente));
}

}
