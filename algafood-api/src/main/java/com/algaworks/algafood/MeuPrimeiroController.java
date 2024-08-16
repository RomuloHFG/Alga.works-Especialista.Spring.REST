package com.algaworks.algafood;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.Service.AtivacaoClienteService;
import com.algaworks.algafood.di.modelo.Cliente;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@xyz.com","22334455");
		
		ativacaoClienteService.ativar(joao);
		
		return "HELLO!";
	}

}
