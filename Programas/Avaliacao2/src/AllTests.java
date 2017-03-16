import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import abastecimento.TestAbastecimento;
import ano.TestAno;
import numero.TestNumero;
import pagamento.TestPagamento;


@RunWith(Suite.class)
@SuiteClasses
({	TestAbastecimento.class,
	TestAno.class,
	TestNumero.class,
	TestPagamento.class,
})
public class AllTests 
{

}
