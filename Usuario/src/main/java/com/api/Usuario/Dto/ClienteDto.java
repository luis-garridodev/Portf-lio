package com.api.Usuario.Dto;
import com.api.Usuario.Models.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ClienteDto {
	private Long id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String data_de_cadastro;
	public ClienteDto( Cliente clientes) {
		this.id 	  = id;
		this.nome     =nome;
		this.cnpj     =cnpj;
		this.endereco =endereco;
		this.data_de_cadastro =data_de_cadastro;
		
}
	public ClienteDto() {
	}
	
	public static List<ClienteDto> converter(List<Cliente> cliente) {
		return cliente.stream().map(ClienteDto::new).collect(Collectors.toList());
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getData_de_cadastro() {
		return data_de_cadastro;
	}
	public void setData_de_cadastro(String data_de_cadastro) {
		this.data_de_cadastro = data_de_cadastro;
	}
}
