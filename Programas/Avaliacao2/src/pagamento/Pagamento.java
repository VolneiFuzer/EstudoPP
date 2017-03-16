package pagamento;

public abstract class Pagamento 
{
	private double valor;
	
	/**
	 * Constroi um objeto para representar um pagamento.
	 * @param valor valor bruto do pagamento
	 */
	protected Pagamento(double valor)
	{	this.valor = valor;
	}
	
	/**
	 * Retorna o valor bruto do pagamento.
	 * @return valor bruto do pagamento
	 */
	public double getValor() 
	{	return valor;
	}
	
	/**
	 * Retorna a quantidade de parcelas do pagamento.
	 * @return quantidade de parcelas
	 */
	public abstract int getQtdParcelas();
	
	/**
	 * Retorna o valor liquido a pagar. O valor liquido eh calculado subtraindo 
	 * o desconto do valor bruto.
	 * @return o valor liquido a pagar (valor apos desconto)
	 */
	public double getValorAPagar()
	{	return getValor();
	}
	
	/**
	 * Retorna o valor a ser pago em cada parcela.
	 * @return valor de cada parcela
	 */
	public double getValorParcela()
	{	return getValorAPagar() / getQtdParcelas();
	}
}
