import java.awt.geom.*;

public class Bola
{	private static final int TAM_X = 15;
	private static final int TAM_Y = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;
	
	
	public void mover(Rectangle2D retangulo)
	{	x += dx;
      	y += dy;
		if (x < retangulo.getMinX())
		{	x = retangulo.getMinX();
			dx = -dx;
		}
		if (x + TAM_X >= retangulo.getMaxX())
		{	x = retangulo.getMaxX() - TAM_X;
		    dx = -dx;
		}
		if (y < retangulo.getMinY())
		{	y = retangulo.getMinY();
		    dy = -dy;
		}
		if (y + TAM_Y >= retangulo.getMaxY())
		{	y = retangulo.getMaxY() - TAM_Y;
		    dy = -dy;
		}
	}

	public Ellipse2D getForma()
	{	return new Ellipse2D.Double(x, y, TAM_X, TAM_Y);
	}
}
