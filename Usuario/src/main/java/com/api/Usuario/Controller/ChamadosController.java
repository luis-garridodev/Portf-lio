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

import com.api.Usuario.Dto.ChamadosDto;
import com.api.Usuario.Models.Chamados;
import com.api.Usuario.Repository.ChamadosRepository;
@RestController
@RequestMapping("/Chamados")

public class ChamadosController {
	@Autowired
	public ChamadosRepository repository;
	
	@GetMapping
	public List<ChamadosDto>ListarChamados(){
		return ChamadosDto.converter(repository.findAll());
		
	}
@PostMapping
public ResponseEntity<Chamados>CriarChamado(@RequestBody ChamadosDto chamadosdto){
	ModelMapper mapper=new ModelMapper();
	Chamados savechamados=mapper.map(chamadosdto, Chamados.class);
	return  ResponseEntity.ok(repository.save(savechamados));
}
}
