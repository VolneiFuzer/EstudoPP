package numero;

public class Numero 
{
	private int valor;
	
	/**
	 * Altera o valor do numero.
	 * @param valor novo valor do numero
	 */
	public void setValor(int valor) 
	{	this.valor = valor;
	}

	/**
	 * Retorna o valor do numero.
	 * @return valor do numero
	 */
	public int getValor() 
	{	return valor;
	}

	/**
	 * Retorna a quantidade de digitos contidos no numero.
	 * Ex: 0 possui 1 digito, 1 possui 1 digito, 10 possui 2 digitos, ...
	 * @return quantidade de digitos
	 */
	public int getQtdDigitos() 
	{	int qtdDigitos = 0;
		int valor = this.valor;
		do 
		{	valor = valor / 10;
			qtdDigitos++;
		} while (valor > 0);
		return qtdDigitos;
	}

	/**
	 * Retorna o valor do fatorial do numero. Ex:
	 * 0! = 1
	 * 1! = 1
	 * 2! = 2. 1 = 2
	 * 4! = 4 . 3 . 2. 1 = 24
     * 5! = 5 . 4 . 3 . 2 . 1 = 120
	 * ...
	 * @return fatorial do valor do numero
	 */
	public int getFatorial() 
	{	int fatorial = 1;
		for (int i = 1; i <= this.valor; i++)
		{	fatorial = fatorial * i;
		}
		return fatorial;
	}
}
