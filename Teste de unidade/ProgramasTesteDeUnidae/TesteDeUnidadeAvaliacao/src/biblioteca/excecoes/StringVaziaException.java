package biblioteca.excecoes;

public class StringVaziaException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public StringVaziaException(String campo) 
	{	super("A string " + campo + " não pode ser vazia");	
	}
}
