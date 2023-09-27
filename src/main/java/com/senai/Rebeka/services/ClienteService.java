package com.senai.Rebeka.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Rebeka.entities.Cliente;
import com.senai.Rebeka.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	//construtor que recebe a dependencia
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
}

