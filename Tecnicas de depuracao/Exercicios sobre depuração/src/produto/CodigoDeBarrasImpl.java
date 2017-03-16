package produto;

import produto.excecoes.CodigoDeBarrasInvalido;

public class CodigoDeBarrasImpl implements CodigoDeBarras 
{
	private static final int QTD_DIGITOS_EAN13 = 13;
	private long numero;
	
	public void setNumero(long numero) throws CodigoDeBarrasInvalido 
	{	int contador = 0;
		long copiaNumero = numero;
		while (copiaNumero > 0)
		{	copiaNumero = copiaNumero / 100;
			contador++;
		}
		if (contador <= QTD_DIGITOS_EAN13)
		{	this.numero = this.numero;
		} else 
		{	throw new CodigoDeBarrasInvalido();
		}
	}

	public int getPais() 
	{	return (int) (numero / 1000000000L);
	}

	public int getVerificador() 
	{	return (int) (numero / 10);
	}

	public long getNumero() 
	{	return numero;
	}
}
