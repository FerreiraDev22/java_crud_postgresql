package controllers;

import entities.Cliente;
import helpers.ClienteHelper;
import repositories.ClienteRepository;

public class ClienteController {

	// método para realizar o cadastro de um cliente
	public void cadastrarCliente() {

		try {

			System.out.println("\nCADASTRO DE CLIENTES\n");

			Cliente cliente = new Cliente();

			cliente.setNome(ClienteHelper.lerNome());
			cliente.setEmail(ClienteHelper.lerEmail());
			cliente.setTelefone(ClienteHelper.lerTelefone());

			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.create(cliente);

			System.out.println("\nCliente cadastrado com sucesso.");
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

}