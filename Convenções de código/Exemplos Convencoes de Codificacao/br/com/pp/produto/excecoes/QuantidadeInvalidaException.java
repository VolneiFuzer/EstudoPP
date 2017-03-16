package excecoes;

/**
 * Excecao que e lan�ada quando e fornecido um valor zerado ou negativo para a 
 * quantidade.
 */
public class QuantidadeInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public QuantidadeInvalidaException() {
		super("Quantidade invalida");
	}
	
}
