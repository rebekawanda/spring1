package com.senai.Rebeka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Rebeka.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
