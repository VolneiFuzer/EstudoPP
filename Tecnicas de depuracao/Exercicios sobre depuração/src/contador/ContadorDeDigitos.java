package contador;

public class ContadorDeDigitos
{	private  int valor;

	public void setValor(int valor)
	{	this.valor = valor;
	}

	public int getQtdDigitos()
	{	int qtdDigitos = 0;
		do
		{	valor = valor / 10;
			qtdDigitos++;
		} while (valor > 0); 
		return qtdDigitos;
	}
}
