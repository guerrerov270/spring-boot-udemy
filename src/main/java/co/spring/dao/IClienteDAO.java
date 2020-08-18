package co.spring.dao;

import java.util.List;

import co.spring.model.Cliente;

public interface IClienteDAO {

	public List<Cliente> findAll();

}
