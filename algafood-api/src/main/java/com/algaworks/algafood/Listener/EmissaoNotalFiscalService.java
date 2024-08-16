package com.algaworks.algafood.Listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.Service.ClienteAtivadoEvent;

@Component
public class EmissaoNotalFiscalService {
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
	}
		
}
