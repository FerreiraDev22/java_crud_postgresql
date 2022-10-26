package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		
		connection.close();
	}

	
	public void update(Cliente cliente) throws Exception {
	Connection connection = ConnectionFactory.createConnection();
	
	PreparedStatement stament = connection.prepareStatement("update cliente set nome=?, email=?, telefone=? where idcliente=?");
	
	stament.setString(1, cliente.getNome());
	stament.setString(2, cliente.getEmail());
	stament.setString(3, cliente.getTelefone());
	stament.setInt(   4, cliente.getIdCliente());
	
	stament.execute();
	
	connection.close();
	
	
	
	}

	
	public void delete(Cliente cliente) throws Exception {
		Connection connection = ConnectionFactory.createConnection();
		PreparedStatement stament = connection.prepareStatement("delete from cliente where idcliente=?");
		stament.setInt(1, cliente.getIdCliente());
		stament.execute();
		
		connection.close();
		
		
	}

	
	public List<Cliente> findAll() throws Exception {
		
		Connection connection = ConnectionFactory.createConnection();
		
		
		PreparedStatement statement = connection.prepareStatement("select * from cliente");
		ResultSet resultSet = statement.executeQuery();
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
	while(resultSet.next()) {
			
			Cliente cliente = new Cliente();
			
			cliente.setIdCliente(resultSet.getInt("idcliente"));
			cliente.setNome(resultSet.getString("nome"));
			cliente.setEmail(resultSet.getString("email"));
			cliente.setTelefone(resultSet.getString("telefone"));
			
			lista.add(cliente);
		}
		
		connection.close(); 
		return lista;
		
		
	}


	
			
		public Cliente findById(Integer idCliente) throws Exception {

			
			Connection connection = ConnectionFactory.createConnection();
			
		
			PreparedStatement statement = connection.prepareStatement("select * from cliente where idcliente=?");
			statement.setInt(1, idCliente);
			ResultSet resultSet = statement.executeQuery();
			
			Cliente cliente = null;
			
		
			if(resultSet.next()) {
				
				cliente = new Cliente();
				
				cliente.setIdCliente(resultSet.getInt("idcliente"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setEmail(resultSet.getString("email"));
				cliente.setTelefone(resultSet.getString("telefone"));
			}
			
			connection.close(); 
			return cliente;
		}
	}



