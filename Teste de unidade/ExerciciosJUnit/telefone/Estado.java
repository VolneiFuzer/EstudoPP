package telefone;

public enum Estado 
{
	SP("São Paulo", new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19}),
	RJ("Rio de Janeiro", new int[]{21, 22, 24}),
	ES("Espírito Santo", new int[]{27, 28}),
	MG("Minas Gerais", new int[]{31, 32, 33, 34, 35, 37, 38}),
	PR("Paraná", new int[]{41, 42, 43, 44, 45, 46}),
	SC("Santa Catarina", new int[]{47, 48, 49}),
	RS("Rio Grande do Sul", new int[]{51, 53, 54, 55}),
	DF("Distrito Federal", new int[]{51, 53, 54, 55}),
	GO("Goiás", new int[]{62, 64}),
	TO("Tocantins", new int[]{63}),
	MT("Mato Grosso", new int[]{65, 66}),
	MS("Mato Grosso do Sul", new int[]{67}),
	AC("Acre", new int[]{68}),
	RO("Rondônia", new int[]{69}),
	BA("Bahia", new int[]{71, 73, 74, 75, 77}),
	SE("Sergipe", new int[]{79}),
	PE("Pernambuco", new int[]{81, 87}),
	AL("Alagoas", new int[]{82}),
	PB("Paraíba", new int[]{83}),
	RN("Rio Grande do Norte", new int[]{84}),
	CE("Ceará", new int[]{85, 88}),
    PI("Piauí", new int[]{86, 89}),
    PA("Pará", new int[]{93, 94}),
    AM("Amazonas", new int[]{92, 97}),
    RR("Roraima", new int[]{95}),
    AP("Amapá", new int[]{96}),
    MA("Maranhão", new int[]{98, 99});
    
	private int[] ddds;
	private String nome;
	
	private Estado(String nome, int[] ddds)
	{	this.nome = nome;
		this.ddds = ddds;	
	}
	
	public int[] getDDDs()
	{	return this.ddds;
	}
	
	public String getNome() 
	{	return nome;
	}
}
