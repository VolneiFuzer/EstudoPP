package equacao;

public class EquacaGrau2Implements implements EquacaoGrau2{

	private double a;
	private double b;
	private double c;
	
	private int qntRaizes = 0;
	
	public void setA(double a) 
	{	this.a = a;	
	}

	public void setB(double b) 
	{	this.b = b;
	}

	public void setC(double c) 
	{	this.c= c;
	}

	public double getDelta() 
	{	return Math.pow(b, 2) - 4 * a * c;
	}

	public int getQtdRaizes() 
	{	if (getDelta() == 0)  
		{	qntRaizes = 1;
		} else if (getDelta() > 0) 
			{ qntRaizes = 2;
			}
		return qntRaizes;
	}

	public double getRaiz1() 
	{	return (-b + Math.sqrt(getDelta())) / (2*a);
	}

	public double getRaiz2()
	{	return (-b - Math.sqrt(getDelta())) / (2*a);
	}
}
