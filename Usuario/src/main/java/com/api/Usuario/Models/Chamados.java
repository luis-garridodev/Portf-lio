package com.api.Usuario.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "chamados")
public class Chamados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Cliente cliente;
	private Status status;
	private   Assunto assunto;
	private String Data_de_cadastro;
	private String complemento;
	
	public Chamados(Long id,Cliente cliente, Assunto assunto,String Data_de_cadastro,String complemento) {
		this.id=id;
		this.cliente=cliente;
		this.assunto=assunto;
		this.Data_de_cadastro=Data_de_cadastro;
		this.complemento=complemento;
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
	public Cliente get_cliente() {
		return cliente;
	
	}
	public void  set_cliente(Cliente cliente) {
		this.cliente=cliente;
	}
	public Status get_status() {
		return status;
	
	}
	public void  set_status(Status status) {
		this.status=status;
	}
	public Assunto get_assunto() {
		return assunto;
	
	}
	public void  set_assunto(Assunto assunto) {
		this.assunto=assunto;
	}
	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}


