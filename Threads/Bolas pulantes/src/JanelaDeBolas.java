import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JanelaDeBolas extends JFrame
{	
	private static final long serialVersionUID = 1L;
	private PainelDeBolas painelDeBolas;
	public static final int LARGURA = 450;
	public static final int ALTURA = 350;
	public static final int PASSOS = 3000;
	public static final int ATRASO = 3;
   
   public JanelaDeBolas()
   {
	   setSize(LARGURA, ALTURA);
	   setTitle("Bolas pulantes");

		painelDeBolas = new PainelDeBolas();
		add(painelDeBolas, BorderLayout.CENTER);
		JPanel painelDeBotoes = new JPanel();
		addBotao(painelDeBotoes, "Iniciar", new ActionListener()
		{	public void actionPerformed(ActionEvent evento)
		    {	addBola();
		    }
		});
		
		addBotao(painelDeBotoes, "Fechar", new ActionListener()
		{	public void actionPerformed(ActionEvent evento)
		    {	System.exit(0);
		    }
		});
		add(painelDeBotoes, BorderLayout.SOUTH);
   }
   
   public void addBotao(Container c, String titulo, ActionListener ouvinte)
   {	JButton botao = new JButton(titulo);
   		c.add(botao);
   		botao.addActionListener(ouvinte);
   }

   public void addBola()
   {	try
      	{	Bola bola = new Bola();
      		painelDeBolas.addBola(bola);
	        for (int i = 1; i <= PASSOS; i++)
	        {	bola.mover(painelDeBolas.getBounds());
	            painelDeBolas.paint(painelDeBolas.getGraphics());
	            Thread.sleep(ATRASO);
	        }
      	}
      	catch (InterruptedException e)
      	{
      	}
   }
}