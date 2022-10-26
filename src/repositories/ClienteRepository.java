package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Cliente;
import factories.ConnectionFactory;

public class ClienteRepository {

	
	public void create(Cliente cliente) throws Exception {

		
		Connection connection = ConnectionFactory.createConnection();

		
		PreparedStatement statement = connection.prepareStatement("insert into cliente(nome, email, telefone) values(?, ?, ?)");
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEmail());
		statement.setString(3, cliente.getTelefone());
		statement.execute();
		
		//fechando a conexão com o banco de dados
		connection.close();
	}

	
	public void update(Cliente cliente) throws Exception {
		// TODO
	}

	
	public void delete(Cliente cliente) throws Exception {
		// TODO
	}

	
	public List<Cliente> findAll() throws Exception {
		// TODO
		return null;
	}

	
	public Cliente findById(Integer idCliente) throws Exception {
		// TODO
		return null;
	}
}



