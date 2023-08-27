/**
 * 
 */
package br.com.gomes.services;

import br.com.gomes.domain.Cliente;
import br.com.gomes.exceptions.DAOException;
import br.com.gomes.exceptions.TipoChaveNaoEncontradaException;
import br.com.gomes.services.generic.IGenericService;

/**
 * @author wendel.gomes
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
