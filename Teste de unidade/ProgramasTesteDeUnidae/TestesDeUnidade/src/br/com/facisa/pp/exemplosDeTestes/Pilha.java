package br.com.facisa.pp.exemplosDeTestes;

public interface Pilha 
{
	public int getTamanho();
	
	public void empilhar(String elemento);
	
	public String getTopo() throws PilhaVaziaException;
	
	public String desempilhar() throws PilhaVaziaException;
}
