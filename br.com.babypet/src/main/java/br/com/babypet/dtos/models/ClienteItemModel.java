package br.com.babypet.dtos.models;

import br.com.babypet.domain.Cliente;

public class ClienteItemModel {

	private String idCliente;
	private String nomeCliente;
	
	public String getIdCliente() {
		return idCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public static ClienteItemModel of(Cliente cliente) { //pode usar "from" no lugar de "of"
		ClienteItemModel model = new ClienteItemModel();
		
		model.idCliente = cliente.getId();
		model.nomeCliente = cliente.getNome();
		
		return model;
	}

}
