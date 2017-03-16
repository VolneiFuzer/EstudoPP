package br.com.facisa.pp.contador;

/**
 * Esta classe implementa um contador.
 * @author Bruno de Brito
 */
public class ContadorDeNumeros
{                                  
	private int num; 
	
	/**
	 * Incrementa o contador interno em um.
	 */
	public void incrementar()
	{	setNum(getNum() + 1);
	}   	
	
	/**
	 * Decrementa o contador interno em um.
	 */
	public void decrementar()
	{   setNum(getNum() - 1);
	}  
	
	/**
	 * Reinicia o contador para determinado valor.
	 * @param Inicial novo valor inicial
	 */
	public void comecar(int Inicial) 
	{   setNum(Inicial);  
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}   
 } 