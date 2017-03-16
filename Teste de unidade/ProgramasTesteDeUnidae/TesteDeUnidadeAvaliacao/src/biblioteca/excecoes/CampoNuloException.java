package biblioteca.excecoes;

public class CampoNuloException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public CampoNuloException(String campo) 
	{	super("O campo " + campo + " n�o pode ser nulo");	
	}
}
