package abastecimento;

public class Abastecimento 
{
	private static final double PROPORCAO = 0.7;
	private double gasolina;
	private double alcool;
	
	/**
	 * Altera o preco da gasolina no abastecimento.
	 * @param gasolina novo preco da gasolina
	 */
	public void setGasolina(double gasolina) 
	{	this.gasolina = gasolina;
	}
	
	/**
	 * Altera o preco do alcool no abastecimento.
	 * @param alcool novo preco do alcool
	 */
	public void setAlcool(double alcool) 
	{	this.alcool = alcool;
	}
	
	/**
	 * Retorna a recomendacao do combustivel a ser utilizado no abastecimento
	 * de acordo com os precos fornecidos. Devemos abastecer com alcool quando o 
	 * preco do alcool corresponder a menos de 70% do preco da gasolina.
	 * @return retorna string com a recomendacao do combustivel a ser utilizado
	 */
	public String getRecomendacao()
	{	String recomendacao = "empate";
		double diferenca = (gasolina * PROPORCAO) - alcool;
		if (-0.01 < diferenca && diferenca < 0.01)
		{	recomendacao  = "empate";
		} else if (diferenca <= -0.01)
		{	recomendacao  = "gasolina";
		} else if (diferenca >= 0.01)
		{	recomendacao  = "alcool";
		}
		return recomendacao;
	}
}
