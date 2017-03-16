package pagamento;

public class PagamentoAVistaComDesconto extends PagamentoAVista 
{
	private double desconto;
	
	/**
	 * Constroi um objeto para representar um pagamento.
	 * @param valor valor bruto do pagamento
	 */
	public PagamentoAVistaComDesconto(double valor, double desconto)
	{	super(valor);
		this.desconto = desconto;
	}
	
	/**
	 * Retorna o valor liquido a pagar. O valor liquido eh calculado subtraindo 
	 * o desconto do valor bruto.
	 * @return o valor liquido a pagar (valor apos desconto)
	 */
	public double getValorAPagar() 
	{	return getValor() * (1.0  - (desconto / 100));
	}
}
