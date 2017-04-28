import java.util.ArrayList;
public class JogoTabuleiro {

	protected String nome;
	protected String faixaEtaria;
	protected ArrayList<String> pecas;
	protected ArrayList<String> regras;
	protected ArrayList<String> objetivos;
	protected ArrayList<String> jogadores;

	public String getNome(){
		return this.nome;
	}

	public String getFaixaEtaria(){
		return this.faixaEtaria;
	}

	public ArrayList<String> getPecas(){
		return this.pecas;
	}

	public ArrayList<String> getRegras(){
		return this.regras;
	}

	public ArrayList<String> getObjetivos(){
		return this.objetivos;
	}

	public ArrayList<String> getJogadores(){
		return this.jogadores;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setFaixaEtaria(String faixaEtaria){
		this.faixaEtaria = faixaEtaria;
	}

	public void setPecas(ArrayList<String> pecas){
		this.pecas = pecas;
	}

	public void setRegras(ArrayList<String> regras){
		this.regras = regras;
	}

	public void setObjetivos(ArrayList<String> objetivos){
		this.objetivos = objetivos;
	}

	public void setJogadores(ArrayList<String> jogadores){
		this.jogadores = jogadores;
	}

	public void jogar(){

	}

}