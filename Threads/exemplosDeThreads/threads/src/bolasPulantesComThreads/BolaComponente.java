package bolasPulantesComThreads;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class BolaComponente extends JComponent
{
	private static final long serialVersionUID = 1L;
	private ArrayList<Bola> bolas = new ArrayList<Bola>();
	
   public void addBola(Bola bola)
   {	bolas.add(bola);
   }

   public void paintComponent(Graphics g)
   {	Graphics2D g2 = (Graphics2D) g;
   		for (Bola bola : bolas)
   		{	g2.fill(bola.getForma());
   		}
   }
}

