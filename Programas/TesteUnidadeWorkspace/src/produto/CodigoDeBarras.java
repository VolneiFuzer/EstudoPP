package produto;


/**
 * Um código de barras possui um número
 * de acordo com a codificação EAN-13. 
 * Formato: CCCPPPPPPPPPV, em que CCC é o
 * código do país, é o código do fabricante combinado 
 * com o produto e V é o dígito verificador.
 */
public interface CodigoDeBarras 
{
	/**
	 * Altera o número do código de barras.
	 * @param numero novo número do código de barras
	 * @throws CodigoDeBarrasInvalido se o código não estiver
	 * no padrão de validação EAN-13 
	 * (ver http://pt.wikipedia.org/wiki/EAN-13)
	 */
	public void setNumero(long numero) throws CodigoDeBarrasInvalido; 
	
	/**
	 * Retorna o código do país do produto
	 * @return código do país
	 */
	public int getPais();
	
	/**
	 * Retorna o código do fabricante combinado
	 * com o código do produto
	 * @return código fabricante + produto
	 */
	public int getFabricanteProduto();
	
	/**
	 * Retorna o dígito verificador do código do produto
	 * @return dígito verificador
	 */
	public int getVerificador();

}
