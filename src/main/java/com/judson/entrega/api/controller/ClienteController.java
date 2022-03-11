package com.judson.entrega.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.judson.entrega.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cl1 = new Cliente(1L, "Judson Paiva", "judsonpaiva16@gmail.com", "+244 926 30 30 35");
		var cl2 = new Cliente(2L, "Quissanga Coge", "judsonpaiva16@gmail.com", "+244 926 30 30 35");
		var cl3 = new Cliente(3L, "Judson Quissanga", "judsonpaiva16@gmail.com", "+244 926 30 30 35");
		
		return Arrays.asList(cl1, cl2, cl3);
	}
	
	
}
