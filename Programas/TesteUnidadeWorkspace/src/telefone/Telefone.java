package telefone;

/**
 * Um telefone possui um numero no formato:
 * código do pais + código ddd + número identificador
 * com oito dígitos. Ex: 556134111200, em que o código
 * do país é 55, o DDD é 61 e o número identificador 
 * é 3411-1200. 
 */
public interface Telefone 
{
	/**
	 * Altera o numero do telefone. 
	 * @param numero novo número do telefone
	 */
	public void setNumero(long numero);
	
	/**
	 * Retorna o código do país do telefone.
	 * @return código do pais
	 */
	public int getCodigoPais();

	/**
	 * Retorna o código DDD do telefone.
	 * @return código DDD
	 */
	public int getDDD();
	
	/**
	 * Retorna o número identificador do telefone.
	 * @return número identificador
	 */
	public int getIdentificador();

	/**
	 * Retorna o estado de origem do telefone.
	 * @return estado do telefone
	 */
	public Estado getEstado();

	public int getTamanhoNumero();
}
