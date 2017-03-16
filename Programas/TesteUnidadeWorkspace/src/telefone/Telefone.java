package telefone;

/**
 * Um telefone possui um numero no formato:
 * c�digo do pais + c�digo ddd + n�mero identificador
 * com oito d�gitos. Ex: 556134111200, em que o c�digo
 * do pa�s � 55, o DDD � 61 e o n�mero identificador 
 * � 3411-1200. 
 */
public interface Telefone 
{
	/**
	 * Altera o numero do telefone. 
	 * @param numero novo n�mero do telefone
	 */
	public void setNumero(long numero);
	
	/**
	 * Retorna o c�digo do pa�s do telefone.
	 * @return c�digo do pais
	 */
	public int getCodigoPais();

	/**
	 * Retorna o c�digo DDD do telefone.
	 * @return c�digo DDD
	 */
	public int getDDD();
	
	/**
	 * Retorna o n�mero identificador do telefone.
	 * @return n�mero identificador
	 */
	public int getIdentificador();

	/**
	 * Retorna o estado de origem do telefone.
	 * @return estado do telefone
	 */
	public Estado getEstado();

	public int getTamanhoNumero();
}
