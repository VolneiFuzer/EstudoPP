package feriado;

import java.util.Calendar;

/**
 * Um feriado fixo é aquele cuja data não muda 
 * com o passar dos anos. Um feriado fixo possui
 * um data e um descrição. 
 */
public interface FeriadoFixo 
{
	/**
	 * Altera a data do feriado.
	 * @param data nova data do feriado
	 * @throws DataNaoEhFeriadoException se a data não corresponde 
	 * a um nenhuma das seguintes datas:
	 * 1º de Janeiro: Confraternização Universal; 
	 * 21 de Abril: Tiradentes;
	 * 1º de Maio: Dia do Trabalho;
	 * 7 de Setembro: Independência do Brasil;
	 * 12 de Outubro: Nossa Senhora Aparecida;
	 * 2 de Novembro: Finados;
	 * 15 de Novembro: Proclamação da República;
	 * 25 de Dezembro: Natal.
	 */
	public void setData(Calendar data) throws DataNaoEhFeriadoException;

	/**
	 * Retorna a data do feriado.
	 * @return data do feriado
	 */
	public String getData();
	
	/**
	 * Retorna a descrição do feriado. De acordo com a 
	 * listagem a seguir:
	 * 1º de Janeiro: Confraternização Universal; 
	 * 21 de Abril: Tiradentes;
	 * 1º de Maio: Dia do Trabalho;
	 * 7 de Setembro: Independência do Brasil;
	 * 12 de Outubro: Nossa Senhora Aparecida;
	 * 2 de Novembro: Finados;
	 * 15 de Novembro: Proclamação da República;
	 * 25 de Dezembro: Natal.
	 * @return descrição do feriado
	 */
	public String getDescricao();
}
