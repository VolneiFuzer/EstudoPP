import java.text.DecimalFormat;

public class InsertionSortArray 
{	
	private int tamanhoArray;
	private int posicao = 0;
	private String[] nomeAlunos;
	private double[] notaAlunos;
	private double ponto = 1.1;	
	private String dadosParaTratar;
	
	public void criaArrayNomes ()
	{	this.nomeAlunos = new String[getTamanhoArray()];
	}

	public void criaArrayNotas()
	{	this.notaAlunos = new double[getTamanhoArray()];
	}
	
	public int getTamanhoArray() 
	{	return tamanhoArray;
	}
	
	public void setTamanhoArray(int tamanhoArray) 
	{	this.tamanhoArray = tamanhoArray;
	}
	
	public void adicionarDados(String nome, double nota)
	{	nomeAlunos[posicao] = nome;
		notaAlunos[posicao] = nota;
		posicao ++;
	}
	
	public String getDadosParaTratar() 
	{	return dadosParaTratar;
	}

	public void setDadosParaTratar(String dadosParaTratar) 
	{	this.dadosParaTratar = dadosParaTratar;
	}
	
	public void ordenaDados()
	{		
		for (int x = 0; x <= getTamanhoArray()-1; x++)
		{	double daVezNota = notaAlunos[x];
			String daVezNome = nomeAlunos[x];
			
			int y = x-1;
			
			while (y >=0 && notaAlunos[y] > daVezNota)
			{	notaAlunos[y+1] = notaAlunos[y];
				nomeAlunos[y+1] = nomeAlunos[y];
				y --;
			}
			
			notaAlunos[y + 1] = daVezNota;
			nomeAlunos[y + 1] = daVezNome;
		}	
	}
	
	public String toString()
	{	String arreyString = "";
		DecimalFormat df = new DecimalFormat("0.0");
		for (int x = getTamanhoArray()-1; x >= 0; x--) 
		{	if(ponto >= 0.01)
			{	ponto = ponto - 0.1;
			} else 
				{	ponto = 0.0;
				}
			arreyString += nomeAlunos[x] + " " + df.format(ponto)  + "\n";	
		}
		return arreyString.replace(",",".");
	}
	
	public void getDadosAjustaDados()
	{	String dadosParaAjustar = getDadosParaTratar();
		String [] dadosTratados = dadosParaAjustar.split(" ");
		adicionarDados(dadosTratados[0], Double.parseDouble(dadosTratados[1]));
	}
} 
