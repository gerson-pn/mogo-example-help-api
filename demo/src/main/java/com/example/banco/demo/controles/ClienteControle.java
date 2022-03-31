package com.example.banco.demo.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banco.demo.entidades.Cliente;
import com.example.banco.demo.repositorios.ClienteRepositorio;

@RestController
public class ClienteControle {

	@Autowired
	private ClienteRepositorio repositorio;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> obterClientes() {
		List<Cliente> clientes = repositorio.findAll();
		if (clientes.isEmpty()) {
			ResponseEntity<List<Cliente>> resposta = new ResponseEntity<>(clientes, HttpStatus.NOT_FOUND);
			return resposta;
		} else {
			ResponseEntity<List<Cliente>> resposta = new ResponseEntity<>(clientes, HttpStatus.OK);
			return resposta;
		}
	}

}
