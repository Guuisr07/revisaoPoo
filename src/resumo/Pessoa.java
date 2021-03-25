package resumo;

public abstract class Pessoa implements Autenticacao {
	private String nome;
	public abstract double calcRefeicao();
	// N�o tem constructor, pois voc� n�o instancia uma classa abstrata
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
}
