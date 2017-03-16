package questao02.solucao;

import java.text.ParseException;

import questao02.solucao.Alarme;
import questao02.solucao.Relogio;
import questao02.solucao.RelogioAnalogico;
import questao02.solucao.RelogioDigital;

public class RelogiosApp 
{
	public static void main(String[] args) throws ParseException 
	{	Relogio[] relogios = new Relogio[2];
		relogios[0] = new RelogioDigital();
		relogios[1] = new RelogioAnalogico();
		Alarme alarme = new Alarme(relogios);
		
	}
}
