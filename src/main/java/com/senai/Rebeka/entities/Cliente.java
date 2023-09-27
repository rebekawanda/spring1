package com.senai.Rebeka.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idcCliente;
	
	@Column(name = "ncliente")
	private String nCliente;
	
	@Column(name = "fone")
	private String fone;


	//getters
	//setters
	public Long getId() {
	return idcCliente;
	}
	public void setId(Long id) {
		this.idcCliente =id;
	}
	public String getnCliente() {
		return nCliente;
	}
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	public String getfone() {
		return fone;
	}
	public void setfone(String fone) {
		this.fone = fone;
	}
	}

