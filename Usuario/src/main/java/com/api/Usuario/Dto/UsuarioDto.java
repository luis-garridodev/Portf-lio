package com.api.Usuario.Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.api.Usuario.Models.Usuario;

public class UsuarioDto {
	private long id;
	private String nome;
	private String email;
	
	byte[] foto;
	
	public UsuarioDto(Usuario usuario) {
		this.id 	  = usuario.getId();
		this.nome     = usuario.getNome();
		this.email    = usuario.getEmail();
		
		this.foto     =usuario.getFoto();
		
	}
	public UsuarioDto() {
		// TODO Auto-generated constructor stub
	}
	public static List<UsuarioDto> converte(List<Usuario> usuarios) {
		return usuarios.stream().map( UsuarioDto::new).collect(Collectors.toList());
	}
	
	
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
