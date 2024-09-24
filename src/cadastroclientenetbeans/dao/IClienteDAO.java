/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroclientenetbeans.dao;

import cadastroclientenetbeans.domain.Cliente;

/**
 *
 * @author bruno
 */
public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
	
    public Boolean excluir(Long cpf);

    public Boolean alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    //public Collection<Cliente> buscarTodos();
}
