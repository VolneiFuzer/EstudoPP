
public class PilhaDeArray implements Pilha 
{
	private String[] array = new String[2];
	private int posicao = 0;
	
	public int getTamanho()
	{	return posicao;
	}
	
	public void empilhar(String elemento)
	{	if (posicao == array.length)
		{	String[] novoArray = new String[array.length * 2];
			for (int i = 0; i < array.length; i++)
			{	novoArray[i] = this.array[i];
			}
			array = novoArray;
		}
		array[posicao] = elemento;
		posicao++;
	}
	
	public String getTopo() throws PilhaVaziaException
	{	return array[posicao - 1];
	}
	
	public String desempilhar() throws PilhaVaziaException
	{	if (posicao == 0)
		{	throw new PilhaVaziaException();		
		} else 
		{	
			String elemento = array[posicao - 1];
			posicao--;
			return elemento;
		}
	}
}
