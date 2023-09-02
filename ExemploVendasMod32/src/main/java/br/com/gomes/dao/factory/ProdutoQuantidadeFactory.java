/**
 * 
 */
package br.com.gomes.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.gomes.domain.Produto;
import br.com.gomes.domain.ProdutoQuantidade;

/**
 * @author wendel.gomes
 *
 */
public class ProdutoQuantidadeFactory {

	public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
		Produto prod = ProdutoFactory.convert(rs);
		ProdutoQuantidade prodQ = new ProdutoQuantidade();
		prodQ.setProduto(prod);
		prodQ.setId(rs.getLong("ID"));
		prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
		prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		prodQ.setValorResto(rs.getBigDecimal("VALOR_RESTO"));
		return prodQ;
	}
}
