package com.example.banco.demo.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.banco.demo.entidades.Cliente;

public interface ClienteRepositorio extends MongoRepository<Cliente, String> {
}