package excecoes;

/**
 * Excecao que e lan�ada quando e fornecido um preco negativo, zerado ou com 
 * mais de tres casas decimais.
 */
public class PrecoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PrecoInvalidoException() {
		super("Pre�o inv�lido");
	}
	
}
