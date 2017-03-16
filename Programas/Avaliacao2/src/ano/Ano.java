package ano;

public class Ano 
{
	private int numero;

	/**
	 * Altera o numero do ano.
	 * @param numero novo numero do ano
	 */
	public void setNumero(int numero)
	{	this.numero = numero;
	}

	
	/**
	 * Informa se um dado ano é ou não bissexto. Um ano é bissexto se ele for 
	 * divisível por 400 ou se ele for divisível por 4 e não por 100.
	 * @return
	 */
	public boolean isBissexto() 
	{	return (numero % 400 == 0) || (numero % 4 == 0 && numero % 100 != 0);
	}


	/**
	 * Retorna a quantidade de dias no mes. Janeiro eh 1 e dezembro eh 12.
	 * @param mes numero do mes 
	 * @return quantidade de dias no mes
	 */
	public int getQtdDias(int mes) 
	{	int qtdDias = -1;
		switch (mes)
        {  
            //meses com 31 dias
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               qtdDias = 31;
               break;
  
            //meses com 30 dias
            case 4:
            case 6:
            case 9:
            case 11:	
               qtdDias = 30;
               break;
           
            //mes com 28 dias 
            case 2:
               if (isBissexto())
               {	qtdDias = 29;
               } else 
               {	qtdDias = 28;   
               }
               break;
        } 
		return qtdDias;
	}
}
