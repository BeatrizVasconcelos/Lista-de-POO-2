import java.util.ArrayList;
public class Colecao{

	private ArrayList<Quadrinho> quadrinhos;
	private ArrayList<Bluray> blurays;

	public Colecao(){
		quadrinhos = new ArrayList<>();
		blurays = new ArrayList<>();
	}

	public Colecao(ArrayList<Quadrinho> quadrinhos, ArrayList<Bluray> blurays){
		this.quadrinhos = quadrinhos;
		this.blurays = blurays;
	}

	public ArrayList<Quadrinho> getQuadrinhos(){
		return this.quadrinhos;
	}

	public ArrayList<Bluray> getBlurays(){
		return this.blurays;
	}

	public void setQuadrinhos(ArrayList<Quadrinho> quadrinhos){
		this.quadrinhos = quadrinhos;
	}

	public void setBlurays(ArrayList<Bluray> blurays){
		this.blurays = blurays;
	}

	public void inserirQuadrinho(Quadrinho quadrinho){
		quadrinhos.add(quadrinho);
	}

	public void inserirBluray(Bluray bluray){
		blurays.add(bluray);
	}


	public int tamanho(){
		return this.quadrinhos.size() + this.blurays.size();
	}

	public int numQuadrinhos(){
		return this.quadrinhos.size();
	}

	public int numBlurays(){
		return this.blurays.size();
	}

	public void listarQuadrinhosAutor(String autor){
		int num = 0;
		System.out.println("Lista de quadrinhos de " + autor + ':');
		for(Quadrinho quad : this.quadrinhos){
			if(quad.getAutor().equals(autor)){
				System.out.println(quad);
				num++;
			}
		}
		System.out.println("Nº de quadrinhos encontrados: " + num);
	}

	public void listarQuadrinhosGenero(String genero){
		int num = 0;
		System.out.println("Lista de quadrinhos de " + genero + ':');
		for(Quadrinho quad : this.quadrinhos){
			if(quad.getGenero().equals(genero)){
				System.out.println(quad);
				num++;
			}
		}
		System.out.println("Nº de quadrinhos encontrados: " + num);
	}

	public void listarBluraysDiretor(String diretor){
		int num = 0;
		System.out.println("Lista de blurays dirigidos por " + diretor + ':');
		for(Bluray blu : this.blurays){
			if(blu.getDiretor().equals(diretor)){
				System.out.println(blu);
				num++;
			}
		}
		System.out.println("Nº de Blu-rays encontrados: " + num);
	}

	public void listarBluraysGenero(String genero){
		int num = 0;
		System.out.println("Lista de blurays de " + genero + ':');
		for(Bluray blu : this.blurays){
			if(blu.getGenero().equals(genero)){
				System.out.println(blu);
				num++;
			}
		}
		System.out.println("Nº de Blu-rays encontrados: " + num);
	}

	public void listarQuadrinhosAutor(Quadrinho quadrinho){
		String autor = quadrinho.getAutor();
		int num = 0;
		System.out.println("Lista de quadrinhos de " + autor + ':');
		for(Quadrinho quad : this.quadrinhos){
			if(quad.getAutor().equals(autor)){
				System.out.println(quad);
				num++;
			}
		}
		System.out.println("Nº de quadrinhos encontrados: " + num);
	}

	public void listarQuadrinhosGenero(Quadrinho quadrinho){
		String genero = quadrinho.getGenero();
		int num = 0;
		System.out.println("Lista de quadrinhos de " + genero + ':');
		for(Quadrinho quad : this.quadrinhos){
			if(quad.getGenero().equals(genero)){
				System.out.println(quad);
				num++;
			}
		}
		System.out.println("Nº de quadrinhos encontrados: " + num);
	}

	public void listarBluraysDiretor(Bluray bluray){
		String diretor = bluray.getDiretor();
		int num = 0;
		System.out.println("Lista de blurays dirigidos por " + diretor + ':');
		for(Bluray blu : this.blurays){
			if(blu.getDiretor().equals(diretor)){
				System.out.println(blu);
				num++;
			}
		}
		System.out.println("Nº de Blu-rays encontrados: " + num);
	}

	public void listarBluraysGenero(Bluray bluray){
		String genero = bluray.getGenero();
		int num = 0;
		System.out.println("Lista de blurays de " + genero + ':');
		for(Bluray blu : this.blurays){
			if(blu.getGenero().equals(genero)){
				System.out.println(blu);
				num++;
			}
		}
		System.out.println("Nº de Blu-rays encontrados: " + num);
	}
}