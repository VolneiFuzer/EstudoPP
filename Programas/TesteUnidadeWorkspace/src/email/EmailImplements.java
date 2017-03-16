package email;

public class EmailImplements implements Email
{	private String endereco;

	public void setEndereco(String endereco) throws EmailInvalidoException 
	{	if (endereco.charAt(0) == '@')
			{	throw new EmailInvalidoException();
			}
	
			int indexArroba = endereco.indexOf('@');
			
			String a = endereco.substring(0, indexArroba);
			temCaracteresValidos(a);
		
			int indexPonto1 = endereco.indexOf('.', indexArroba);
			String b = endereco.substring(indexArroba + 1, indexPonto1);
			
		if (b.isEmpty())
			{	throw new EmailInvalidoException();
			} else 
			{	temCaracteresValidos(b);
			}
			
			this.endereco = endereco;
	}
	
	private void temCaracteresValidos(String palavra) throws EmailInvalidoException 
	{
		for (int i = 0; i < palavra.length(); i++)
		{	char letra = palavra.charAt(i);
			if (!isCaracterValido(letra))
				{	throw new EmailInvalidoException();
				}
		}
	}
	
	public String getEndereco() 
	{	return this.endereco;
	}
	
	private boolean isCaracterValido(char caracter)
	{	return ('a' <= caracter &&  caracter <= 'z')
			|| ('0' <= caracter &&  caracter <= '9')
			|| caracter == '.'
			|| caracter == '-'
			|| caracter == '_';
	}
}