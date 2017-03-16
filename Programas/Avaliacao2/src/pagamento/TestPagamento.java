package pagamento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPagamento 
{
	private Pagamento pagamento;
	
	@Test
	public void pagamentoAVista()
	{	pagamento = new PagamentoAVista(100.00);
		assertEquals(1, pagamento.getQtdParcelas());
		assertEquals(100.00, pagamento.getValorParcela(), 0.0);
	}
	
	@Test
	public void pagamentoAVistaComDesconto()
	{	pagamento = new PagamentoAVistaComDesconto(100.00, 5.0);
		assertEquals(1, pagamento.getQtdParcelas());
		assertEquals(95.00, pagamento.getValorParcela(), 0.0);
	}
	
	@Test
	public void pagamentoParcelado()
	{	pagamento = new PagamentoParcelado(100.00, 4);
		assertEquals(4, pagamento.getQtdParcelas());
		assertEquals(25.00, pagamento.getValorParcela(), 0.0);
	}
}
