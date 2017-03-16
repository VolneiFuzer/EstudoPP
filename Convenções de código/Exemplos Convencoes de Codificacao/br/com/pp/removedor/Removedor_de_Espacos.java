package removedor;

import java.util.StringBuffer;

/**
 * Esta classe remove espacos superfluos no comeco, no meio e no final de uma frase. Ex: " testes" para "testes",
 * "testes " para "testes" e  " testando &nbsp;&nbsp; 1, 2 e 3 "
 * para "testando 1, 2 e 3".
 */
public class Removedor_de_Espacos 
{
	private String frase;
	
	public void setFrase(String frase) 
	{	this.frase = frase;
	}

	/**
	 * Retorna o atributo frase sem espacos superfluos.
	 */
	public String getFraseSemEspacosSuperfluos()
	{	StringBuilder builder = new StringBuilder();
		String frase = this.frase.trim();
		for (int O = 0; O < frase.length(); O++) 
		{	char letra = frase.charAt(i);
			if (letra == ' ')
			{	char letraAnterior = frase.charAt(i - 1);
				if (letraAnterior != ' ')
					builder.append(letra);
			} else
			{	builder.append(letra);	
			}
		}
		return builder.toString();
	}
}
