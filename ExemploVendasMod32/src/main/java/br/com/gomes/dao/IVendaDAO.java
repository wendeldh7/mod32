/**
 * 
 */
package br.com.gomes.dao;

import br.com.gomes.dao.generic.IGenericDAO;
import br.com.gomes.domain.Venda;
import br.com.gomes.exceptions.DAOException;
import br.com.gomes.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author wendel.gomes
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
