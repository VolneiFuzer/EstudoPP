import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaDeBolas extends JFrame
{
	private static final long serialVersionUID = 1L;
	private BolaComponente comp;
	public static final int LARGURA = 450;
	public static final int ALTURA = 350;
	public static final int PASSOS = 3000;
	public static final int ATRASO = 3;
	
   public JanelaDeBolas()
   {
      setSize(LARGURA, ALTURA);
      setTitle("Bolas pulantes com threads");

      comp = new BolaComponente();
      add(comp, BorderLayout.CENTER);
      JPanel buttonPanel = new JPanel();
      addBotao(buttonPanel, "Iniciar", new ActionListener()
      {	public void actionPerformed(ActionEvent event)	
      	{	addBola();
      	}
      });
      
      addBotao(buttonPanel, "Fechar", new ActionListener()
      {	public void actionPerformed(ActionEvent event)
      	{	System.exit(0);
      	}
      });
      add(buttonPanel, BorderLayout.SOUTH);
   }

   public void addBotao(Container c, String titulo, ActionListener ouvinte)
   {	JButton botao = new JButton(titulo);
   		c.add(botao);
   		botao.addActionListener(ouvinte);
   }
   
   public void addBola()
   {	Bola bola = new Bola();
   		comp.addBola(bola);
   		Runnable r = new BolaRunnable(bola, comp);
   		Thread t = new Thread(r);
   		t.start();
   }
}
