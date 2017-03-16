package feriado;

import java.util.Calendar;
import java.util.HashMap;

public class FeriadoFixoImplements implements FeriadoFixo
{	
	private Calendar data;
	private HashMap<String, String> mapaFeriados = new HashMap<String, String>();
	
	public FeriadoFixoImplements()
	{	mapaFeriados.put("1/1", "Confraternização Universal");
		mapaFeriados.put("21/4", "Tiradentes");
		mapaFeriados.put("1/5", "Dia do Trabalho");
		mapaFeriados.put("7/9", "Independência do Brasil");
		mapaFeriados.put("12/10", "Nossa Senhora Aparecida");
		mapaFeriados.put("2/11", "Finados");
		mapaFeriados.put("15/9", "Proclamação da República");
		mapaFeriados.put("25/0", "Natal");		
	}

	public void setData(Calendar data) throws DataNaoEhFeriadoException 
	{	
		if(isFeriado(data))
		{	this.data = data;
		} else 
			{	throw new DataNaoEhFeriadoException();
			}
	}
	
	public String getData()
	{
		return (data.get(Calendar.DATE)) + "/" + (data.get(Calendar.MONTH))+ "/" + (data.get(Calendar.YEAR));
	}


	public String getDescricao()
	{	return mapaFeriados.get(getDataKey(data));
	}
	
	private boolean isFeriado (Calendar data)
	{	
		return (mapaFeriados.containsKey(getDataKey(data))); 
	}
	
	private String getDataKey(Calendar data)
	{	
		return (data.get(Calendar.DAY_OF_MONTH)) + "/" + (data.get(Calendar.MONTH));
	}

}
