package biblioteca.excecoes;

public class NumeroInvalidoException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	public NumeroInvalidoException(String campo) 
	{	super("O campo " + campo + " deve ser positivo");	
	}
}
