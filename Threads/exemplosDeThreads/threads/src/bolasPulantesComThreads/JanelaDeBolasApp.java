package bolasPulantesComThreads;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JanelaDeBolasApp 
{
	public static void main(String[] args)
	{	EventQueue.invokeLater(new Runnable()
		{	public void run()
            {	JFrame janela = new JanelaDeBolas();
            	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	janela.setVisible(true);
            }
		});
	}
}
