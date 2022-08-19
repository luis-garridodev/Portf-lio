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

import com.api.Usuario.Dto.UsuarioDto;
import com.api.Usuario.Models.Usuario;
import com.api.Usuario.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
@Autowired
public UsuarioRepository repository;

@GetMapping
public List<UsuarioDto> listarUsuarios(){
	return UsuarioDto.converte(repository.findAll());
}
@PostMapping
public ResponseEntity<Usuario>criarUsuario(@RequestBody UsuarioDto usuarioDto){
	 ModelMapper mapper=new ModelMapper();
	Usuario saveusuario=mapper.map(usuarioDto, Usuario.class);
	return ResponseEntity.ok(repository.save(saveusuario));
}

}
