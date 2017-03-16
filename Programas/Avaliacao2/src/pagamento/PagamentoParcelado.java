package pagamento;

public class PagamentoParcelado extends Pagamento 
{
	private int qtdParcelas;

	/**
	 * Constroi um objeto para representar um pagamento.
	 * @param valor valor bruto do pagamento
	 * @param qtdParcelas quantidade de parcelas
	 */
	public PagamentoParcelado(double valor, int qtdParcelas)
	{	super(valor);
		this.qtdParcelas = qtdParcelas;
		
	}
	
	/**
	 * Retorna a quantidade de parcelas do pagamento.
	 * @return quantidade de parcelas
	 */
	public int getQtdParcelas() 
	{	return qtdParcelas;
	}
}
