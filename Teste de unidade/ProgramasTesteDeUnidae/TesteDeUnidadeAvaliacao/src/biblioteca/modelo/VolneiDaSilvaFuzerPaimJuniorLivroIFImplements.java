package biblioteca.modelo;

import biblioteca.excecoes.CampoNuloException;
import biblioteca.excecoes.NumeroInvalidoException;
import biblioteca.excecoes.StringVaziaException;

public class VolneiDaSilvaFuzerPaimJuniorLivroIFImplements implements LivroIF
{	
	private int edicao;
	private String editora;
	private String titulo;

	public void setEdicao(int edicao) throws NumeroInvalidoException 
	{	if(edicao < 1)
		{ throw new NumeroInvalidoException("Edicao");
		} else 
			{	this.edicao = edicao;
			}	
	}

	public void setEditora(String editora) throws CampoNuloException, StringVaziaException 
	{	
		if(editora == null) 
		{	throw new CampoNuloException("editora");
		} 	else if (editora.split(" ").length == 0) 
			{ throw new StringVaziaException("editora");
			} else 
				{
					this.editora = editora;
				}
	}
	
	public void setTitulo(String titulo) throws CampoNuloException, StringVaziaException 
	{ 	
		if(titulo == null) 
		{	throw new CampoNuloException("Titulo");
		} 	else if (titulo.split(" ").length == 0) 
			{ throw new StringVaziaException("Titulo");
			} else 
				{
					this.titulo = titulo;
				}
	}	
	
	public String getTitulo() 
	{
		return titulo;
	}

	public int getEdicao() 
	{
		return edicao;
	}


	public String getEditora() 
	{
		return editora;
	}
	

}
