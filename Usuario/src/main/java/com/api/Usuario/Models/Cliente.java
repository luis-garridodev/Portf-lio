package com.api.Usuario.Models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String data_de_cadastro;
	//@OneToMany
	//@JoinColumn(name="cliente_id")
	//private List<Chamados> chamados; 
	public Cliente( Long id, String nome,String cnpj, String endereco,String data_de_cadastro) {
		this.id 	  = id;
		this.nome     =nome;
		this.cnpj     =cnpj;
		this.endereco =endereco;
		this.data_de_cadastro =data_de_cadastro;
	
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
	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
