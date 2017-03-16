package relogioSolucao;

import java.util.GregorianCalendar;

public class Alarme implements Runnable 
{
	private static final int INTERVALO = 100;
	private int hora;
	private int minuto;
	private boolean primeiraVez = true;
	private Relogio[] relogios;
	
	
	public Alarme(Relogio[] relogios)
	{	this.relogios = relogios;
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run()
	{	System.out.println("Comecou");
		while (true)
		{	System.out.println("Atualizando");
			int novaHora = getHoraAtual();
			//pega o minuto atual
			int novoMinuto = getMinutoAtual();
		
			//verifica se hora ou minuto mudou
			if (primeiraVez)
			{	disparaHoraMudou(novaHora);
				disparaMinutoMudou(novoMinuto);
				primeiraVez = false;
			} else if (novaHora != hora)
			{	hora = novaHora;
				//hora mudou!
				disparaHoraMudou(novaHora);
			} else if (novoMinuto != minuto)
			{	minuto = novoMinuto;
				//minuto moudou!
				disparaMinutoMudou(novoMinuto);
			} 
			
			try 
			{	//espera durante um intervalo de tempo
				Thread.sleep(INTERVALO);
			} catch (InterruptedException e)
			{	e.printStackTrace();
			}
		}		
	}
	
	private int getHoraAtual()
	{	//pega o momento atual
		GregorianCalendar momento = new GregorianCalendar();
		//pega a hora atual
		return momento.get(GregorianCalendar.HOUR_OF_DAY);
	}
	
	private int getMinutoAtual()
	{	//pega o momento atual
		GregorianCalendar momento = new GregorianCalendar();
		//pega o minuto atual
		return momento.get(GregorianCalendar.MINUTE);
	}

	private void disparaMinutoMudou(int novoMinuto) 
	{	for (Relogio relogio: relogios) 
		{	relogio.minutoMudou(novoMinuto);	
		}
	}

	private void disparaHoraMudou(int novaHora) 
	{	for (Relogio relogio: relogios) 
		{	relogio.horaMudou(novaHora);	
		}
	}
}
