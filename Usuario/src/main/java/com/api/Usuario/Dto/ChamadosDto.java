package com.api.Usuario.Dto;

import java.util.List;
import java.util.stream.Collectors;

import com.api.Usuario.Models.Assunto;
import com.api.Usuario.Models.Cliente;
import com.api.Usuario.Models.Status;
import com.api.Usuario.Models.Chamados;

public class ChamadosDto {
	private Long id;
	private Chamados chamado;
	private Status status;
	
	private String Data_de_cadastro;
	private String complemento;
	public ChamadosDto(Chamados chamado){
		this.id=id;
		this.chamado=chamado;
		this.status=status;
		this.Data_de_cadastro=Data_de_cadastro;
		this.complemento=complemento;
		}


public ChamadosDto() {
}
public static List<ChamadosDto> converter(List<Chamados> chamado) {
	return chamado.stream().map(Cliente -> new ChamadosDto()).collect(Collectors.toList());
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public Chamados getChamado() {
	return chamado;
}


public void setChamado(Chamados chamado) {
	this.chamado = chamado;
}


public Status getStatus() {
	return status;
}


public void setStatus(Status status) {
	this.status = status;
}


public String getData_de_cadastro() {
	return Data_de_cadastro;
}


public void setData_de_cadastro(String data_de_cadastro) {
	Data_de_cadastro = data_de_cadastro;
}


public String getComplemento() {
	return complemento;
}


public void setComplemento(String complemento) {
	this.complemento = complemento;
}
}
