package monitoria_10;

public class Pessoa {

	
	protected String nome;
	protected int idade;
	protected String genero;
	protected boolean eprioridade;
	public Pessoa(String nome, int idade, String genero, boolean eprioridade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.eprioridade = eprioridade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", eprioridade=" + eprioridade
				+ "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isEprioridade() {
		return eprioridade;
	}
	public void setEprioridade(boolean eprioridade) {
		this.eprioridade = eprioridade;
	}
	
	
	
	
	
	
	
	
	
}
