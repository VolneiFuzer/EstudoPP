package mes;

public class Mes 
{	private int numero;
	
	public Mes(int numero)
	{	numero = this.numero;
	}
	
	public Mes(String nome)
	{	if (nome.equals("janeiro"))
		{	this.numero = 1;
		} else if (nome.equals("fevereiro"))
		{	this.numero = 2;
		} else if (nome.equals("março"))
		{	this.numero = 3;
		} else if (nome.equals("abril"))
		{	this.numero = 4;
		} else if (nome.equals("maio"))
		{	this.numero = 5;
		} else if (nome.equals("junho"))
		{	this.numero = 6;
		} else if (nome.equals("julho"))
		{	this.numero = 7;
		} else if (nome.equals("agosto"))
		{	this.numero = 8;
		} else if (nome.equals("setembro"))
		{	this.numero = 9;
		} else if (nome.equals("outubro"))
		{	this.numero = 10;
		} else if (nome.equals("novembro"))
		{	this.numero = 11;
		} else if (nome.equals("dezembro"))
		{	this.numero = 12;
	 	} else 
	 		System.out.println("Número inválido");
	 		this.numero = -1;
	 	
	}
	
	public void setNumero(int numero)
	{	this.numero = numero;
	}
	
	public String getNome()
	{	String nome;
		switch (this.numero)
		{	 case 01:
				nome = "janeiro";
				break;
			case 02:
				nome = "fevereiro";
				break;
			case 03:
				nome = "março";
				break;
			case 04:
				nome = "abril";
				break;
			case 05:
				nome = "maio";
				break;
			case 06:
				nome = "junho";
				break;
			case 07:
				nome = "julho";
				break;
			case 8:
				nome = "agosto";
				break;
			case 9:
				nome = "setembro";
				break;
			case 10:
				nome = "outubro";
				break;
			case 11:
				nome = "novembro";
				break;
			case 12:
				nome = "dezembro";
				break;
			 default:
				 nome = "mês inválido"; 
		} 
		return nome;
	}

	public int getNumero()
	{	return this.numero;
	}
	
}
