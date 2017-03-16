package bolasPulantesComThreads;

import java.awt.Component;

public class BolaRunnable implements Runnable
{
	private Bola bola;
    private Component componente;
    public static final int PASSOS = 1000;
    public static final int ATRASO = 5;
	   
   public BolaRunnable(Bola bola, Component componente)
   {	this.bola = bola;
   		this.componente = componente;
   }

   public void run()
   {	try
   		{	for (int i = 1; i <= PASSOS; i++)
	   		{	bola.mover(componente.getBounds());
	   			componente.repaint();
	   			Thread.sleep(ATRASO);
	   		}
   		}
      	catch (InterruptedException e)
      	{
      	}
   
   
   		boolean trabalhoAcabou = false;
   		long atraso = 0;
   		 
   		try 
   		{	while (!trabalhoAcabou)
	   		{	//continua fazendo o trabalho
				Thread.sleep(atraso);
	   		}
   		} catch (InterruptedException e) 
   		{	//thread foi interrompida durante inatividade
		} finally
   		{	//libera recursos, se necessario
   		}
   }
}
