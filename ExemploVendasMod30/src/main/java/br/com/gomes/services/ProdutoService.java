/**
 * 
 */
package br.com.gomes.services;

import br.com.gomes.dao.IProdutoDAO;
import br.com.gomes.domain.Produto;
import br.com.gomes.services.generic.GenericService;

/**
 * @author wendel.gomes
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
