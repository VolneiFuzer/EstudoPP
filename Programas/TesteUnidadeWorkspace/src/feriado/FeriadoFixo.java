package feriado;

import java.util.Calendar;

/**
 * Um feriado fixo � aquele cuja data n�o muda 
 * com o passar dos anos. Um feriado fixo possui
 * um data e um descri��o. 
 */
public interface FeriadoFixo 
{
	/**
	 * Altera a data do feriado.
	 * @param data nova data do feriado
	 * @throws DataNaoEhFeriadoException se a data n�o corresponde 
	 * a um nenhuma das seguintes datas:
	 * 1� de Janeiro: Confraterniza��o Universal; 
	 * 21 de Abril: Tiradentes;
	 * 1� de Maio: Dia do Trabalho;
	 * 7 de Setembro: Independ�ncia do Brasil;
	 * 12 de Outubro: Nossa Senhora Aparecida;
	 * 2 de Novembro: Finados;
	 * 15 de Novembro: Proclama��o da Rep�blica;
	 * 25 de Dezembro: Natal.
	 */
	public void setData(Calendar data) throws DataNaoEhFeriadoException;

	/**
	 * Retorna a data do feriado.
	 * @return data do feriado
	 */
	public String getData();
	
	/**
	 * Retorna a descri��o do feriado. De acordo com a 
	 * listagem a seguir:
	 * 1� de Janeiro: Confraterniza��o Universal; 
	 * 21 de Abril: Tiradentes;
	 * 1� de Maio: Dia do Trabalho;
	 * 7 de Setembro: Independ�ncia do Brasil;
	 * 12 de Outubro: Nossa Senhora Aparecida;
	 * 2 de Novembro: Finados;
	 * 15 de Novembro: Proclama��o da Rep�blica;
	 * 25 de Dezembro: Natal.
	 * @return descri��o do feriado
	 */
	public String getDescricao();
}
