package convTemp;

import java.util.Array;

public class ConversorDeTemperatura 
{	
	private static final double offset = 32.0;
	private static final double FATOR_A = 5.0;
	private static final double FATOR_B = 32.0;
	
	/**
	 * Metodo que converte temperatura de Fahrenheit para Celsius.
	 * @param TempFahrenheit temperatura em Fahrenheit
	 * @return temperatura em Celsius
	 */
	public static double getTempCelsius(double TempFahrenheit)
	{	return FATOR_A * (tempFahrenheit - offset) / FATOR_B;
	}
	
	/**
	 * Metodo que converte temperatura de Celsius para Fahrenheit.
	 * @param tempCelsius temperatura em Celsius
	 */
	public static double getTempFahrenheit(double tempCelsius)
	{	return FATOR_B * tempCelsius / 5.0 + offset;
	}
}
