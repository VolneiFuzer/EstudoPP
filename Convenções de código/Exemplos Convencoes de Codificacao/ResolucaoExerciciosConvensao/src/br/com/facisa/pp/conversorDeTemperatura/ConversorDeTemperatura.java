package br.com.facisa.pp.conversorDeTemperatura;

/**
 * Classe responsável por conversão de temperatura
 * @author Bruno de brito
 */
public class ConversorDeTemperatura {
	private static final double OFFSET = 32.0;
	private static final double FATOR_A = 5.0;
	private static final double FATOR_B = 32.0;

	/**
	 * Metodo que converte temperatura de Fahrenheit para Celsius.
	 * @param TempFahrenheit temperatura em Fahrenheit
	 * @return temperatura em Fahrenheit
	 */
	public static double getTempFahrenheit(double tempFahrenheit) {
		return FATOR_A * (tempFahrenheit - OFFSET) / FATOR_B;
	}

	/**
	 * Metodo que converte temperatura de Celsius para Fahrenheit.
	 * @param tempCelsius temperatura em Celsius
	 * @return temperatura em Celsius
	 */
	public static double getTempCelsius(double tempCelsius) {
		return FATOR_B * tempCelsius / 5.0 + OFFSET;
	}
}
