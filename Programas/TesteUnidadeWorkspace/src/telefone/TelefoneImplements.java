package telefone;

public class TelefoneImplements implements Telefone
{	
	private long numeroTelefone;
	private int [] numeroEmLista; 

	public void setNumero(long numero)
	{	this.numeroTelefone = numero;
		setNumeroEmLista();
	}
	
	public int getTamanhoNumero()
	{	return numeroEmLista.length;
	}

	public int getCodigoPais() 
	{	
		return Integer.valueOf(Integer.toString(numeroEmLista[0]) + Integer.toString(numeroEmLista[1])).intValue();
	}

	public int getDDD() 
	{	
		return Integer.valueOf(Integer.toString(numeroEmLista[2]) + Integer.toString(numeroEmLista[3])).intValue();
	}

	public int getIdentificador() 
	{	
		StringBuilder stringIndentificado = new StringBuilder(); 
		for (int x = 4; x < Long.toString(numeroTelefone).length(); x++)
		{	
			stringIndentificado.append(Integer.toString(numeroEmLista[x]));
		}
		
		return Integer.valueOf(stringIndentificado.toString()).intValue();
	}

	public Estado getEstado() 
	{
		return null;
	}
	
	private void setNumeroEmLista ()
	{	
		String numeroString = Long.toString(numeroTelefone);
		this.numeroEmLista = new int [numeroString.length()];
		
		for (int x = 0; x < numeroString.length(); x++)
		{	int numeroIndividual = Integer.parseInt(numeroString.substring(x, x+1));
			numeroEmLista[x] = numeroIndividual;
		}
	}
	
}
