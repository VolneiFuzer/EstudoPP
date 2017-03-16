package email;

import email.excecoes.EmailInvalidoException;

/**
 * Um email descreve um endereço para correspondência
 * enviada de forma eletrônica. 
 */
public interface Email 
{
	/**
	 * Altera o endereço deste email.
	 * @param endereco deste email
	 * @throws EmailInvalidoException se o email não for válido.
	 * Formato a@b.c.d, em que: 
	 * - a e b não podem ser vazios 
	 * ou dígitos e os símbolos ponto (.), hífen (-) e underscore (_), 
	 * mas não podem começar e nem terminar com estes símbolos;
	 * - .c não pode ser vazio e só podem conter duas ou três letras
	 * - .d pode ser vazio e só podem conter duas letras 
	 */
	public void setEndereco(String endereco) throws EmailInvalidoException;

	/**
	 * Retorna o endereço de email
	 * @return endereço de email
	 */
	public String getEndereco();
}
