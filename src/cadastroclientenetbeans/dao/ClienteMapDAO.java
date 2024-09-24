/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientenetbeans.dao;

import cadastroclientenetbeans.domain.Cliente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bruno
 */
public class ClienteMapDAO implements IClienteDAO {
    private Map<Long, Cliente> map;
	
	public ClienteMapDAO() {
		this.map = new HashMap<>();
	}

	public Boolean cadastrar(Cliente cliente) {
		if (this.map.containsKey(cliente.getCpf())) {
			return false;
		}
		
		this.map.put(cliente.getCpf(), cliente);
		return true;
	}

	public Boolean excluir(Long cpf) {
		Cliente clienteCadastrado = this.map.get(cpf);
		
		if (clienteCadastrado != null) {
			this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
			return true;
		}
		return false;
		
	}

	public Boolean alterar(Cliente cliente) {
		Cliente clienteCadastrado = this.map.get(cliente.getCpf());
		
		if (clienteCadastrado != null) {
			clienteCadastrado.setNome(cliente.getNome());
			clienteCadastrado.setCidade(cliente.getCidade());
			clienteCadastrado.setEnd(cliente.getEnd());
			clienteCadastrado.setEstado(cliente.getEstado());
			clienteCadastrado.setNumero(cliente.getNumero());
			clienteCadastrado.setTel(cliente.getTel());
			return true;
		}
		return false;
		
	}

	public Cliente consultar(Long cpf) {
		return this.map.get(cpf);
	}

	/*public Collection<Cliente> buscarTodos() {
		return this.map.values();
	}*/
}
