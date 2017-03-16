package email;

import email.excecoes.EmailInvalidoException;

public class EmailImpl implements Email 
{
	private String endereco;

	public void setEndereco(String endereco) throws EmailInvalidoException 
	{	if (!endereco.contains("@"))
		{	throw new EmailInvalidoException();
		}
		int posArroba = endereco.indexOf("@");
		int posSegArroba = endereco.indexOf("@", posArroba + 1);
		if (posSegArroba != -1)
		{	throw new EmailInvalidoException();
		}
		int posPontoPosB = endereco.indexOf(".", posArroba);
		String b = endereco.substring(posArroba + 1, posPontoPosB);
		if (b.length() == 0)
		{	throw new EmailInvalidoException();
		}
	
	}

	public String getEndereco() 
	{	return endereco;
	}
}
