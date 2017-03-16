package pagamento;

public class PagamentoAVista extends Pagamento 
{

	/**
	 * Constroi um objeto para representar um pagamento.
	 * @param valor valor bruto do pagamento
	 */
	public PagamentoAVista(double valor) 
	{	super(valor);
	}

	/**
	 * Retorna a quantidade de parcelas do pagamento.
	 * @return quantidade de parcelas
	 */
	public int getQtdParcelas() 
	{ 	return 1;
	}

	/**
	 * Retorna o valor liquido a pagar. O valor liquido eh calculado subtraindo 
	 * o desconto do valor bruto.
	 * @return o valor liquido a pagar (valor apos desconto)
	 */
	public double getValorAPagar() 
	{	return getValor();
	}
}
