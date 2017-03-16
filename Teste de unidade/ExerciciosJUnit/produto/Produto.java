package produto;

import produto.excecoes.CodigoDeBarrasInvalido;
import produto.excecoes.DescricaoInvalidaException;

/**
 * Um produto possui uma descrição, um código 
 * de barras e um preço. 
 */
public interface Produto 
{
	/**
	 * Altera a descrição do produto.
	 * @param descricao nova descrição do produto
	 * @throws DescricaoInvalidaException se a descrição 
	 * for menor que duas letras 
	 */
	public void setDescricao(String descricao) throws DescricaoInvalidaException;
	
	/**
	 * Retorna a descrição do produto.
	 * @return descrição do produto
	 */
	public String getDescricao();
	
	/**
	 * Altera o código de barras do produto. 
	 * @param codigo novo código de barras do produto
	 * @throws CodigoDeBarrasInvalido se o código de 
	 * barras for nulo ou o código estiver zerado
	 */
	public void setCodigoDeBarras(CodigoDeBarras codigo) throws CodigoDeBarrasInvalido;
	
	/**
	 * Retorna o código de barras do produto.
	 * @return código de barras do produto
	 */
	public CodigoDeBarras getCodigoDeBarras();
	

}
