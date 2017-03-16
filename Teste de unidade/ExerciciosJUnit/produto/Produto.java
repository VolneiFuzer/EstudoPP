package produto;

import produto.excecoes.CodigoDeBarrasInvalido;
import produto.excecoes.DescricaoInvalidaException;

/**
 * Um produto possui uma descri��o, um c�digo 
 * de barras e um pre�o. 
 */
public interface Produto 
{
	/**
	 * Altera a descri��o do produto.
	 * @param descricao nova descri��o do produto
	 * @throws DescricaoInvalidaException se a descri��o 
	 * for menor que duas letras 
	 */
	public void setDescricao(String descricao) throws DescricaoInvalidaException;
	
	/**
	 * Retorna a descri��o do produto.
	 * @return descri��o do produto
	 */
	public String getDescricao();
	
	/**
	 * Altera o c�digo de barras do produto. 
	 * @param codigo novo c�digo de barras do produto
	 * @throws CodigoDeBarrasInvalido se o c�digo de 
	 * barras for nulo ou o c�digo estiver zerado
	 */
	public void setCodigoDeBarras(CodigoDeBarras codigo) throws CodigoDeBarrasInvalido;
	
	/**
	 * Retorna o c�digo de barras do produto.
	 * @return c�digo de barras do produto
	 */
	public CodigoDeBarras getCodigoDeBarras();
	

}
