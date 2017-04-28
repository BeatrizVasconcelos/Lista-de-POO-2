public class Bluray extends Item{

	private String diretor;
	private String duracao;
	private String genero;


	public Bluray(String nome, String diretor, String genero){
		this.nome = nome;
		this.diretor = diretor;
		this.genero = genero;
	}

	public String getDiretor(){
		return this.diretor;
	}
	
	public String getDuracao(){
		return this.duracao;
	}
	
	public String getGenero(){
		return this.genero;
	}

	public void setDiretor(String diretor){
		this.diretor = diretor;
	}
	
	public void setDuracao(String duracao){
		this.duracao = duracao;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}

	public boolean compararDiretor(Bluray other){
		return this.diretor.equals(other.diretor);
	}

	public boolean compararGenero(Bluray other){
		return this.genero.equals(other.genero);
	}
}