package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import Connect.Connect;

@Entity
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BANCO")
	private int id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "AGENCIA")
	private String agencia;
	@Column(name = "CNPJ")
	private String cnpj;
	
	

	public Banco(String nome, String agencia, String cnpj) {
		this.nome = nome;
		this.agencia = agencia;
		this.cnpj = cnpj;
		Connect c = new Connect();
		c.connectAndAdd(this);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	

}
