package com.senai.Rebeka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Rebeka.entities.Cliente;
import com.senai.Rebeka.services.ClienteService;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
	private final ClienteService clienteservice;
	
	@Autowired
	public ClienteController(ClienteService clienteservice) {
		this.clienteservice = clienteservice;
	}	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteservice.saveCliente(cliente);
	}
	@GetMapping("/{id}")
	public Cliente getCliente (@PathVariable Long id) {
		return clienteservice.getClienteById(id);
	}
	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteservice.getAllClientes();
	}
	@DeleteMapping("/{id}")
	public void deleteCliente (@PathVariable Long id) {
		clienteservice.deleteCliente(id);
	}
}
