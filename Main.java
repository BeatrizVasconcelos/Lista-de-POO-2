public class Main{
	public static void main(String[] args){
		Quadrinho guerCiv = new Quadrinho("Guerra Civil", "Mark Millar", "Ação");
		Quadrinho lanVerm = new Quadrinho("A Ira dos Lanternas Vermelhos", "Geoff Jones", "Ação");
		Quadrinho logan = new Quadrinho("Velho Logan", "Mark Millar", "Ação");

		Bluray lotr = new Bluray("O Senhor dos Aneis: A Sociedade do Anel", "Peter Jackson", "Aventura");
		Bluray kingKong = new Bluray("King Kong", "Peter Jackson", "Ação");
		Bluray animFant = new Bluray("Animais Fantásticos e Onde Habitam", "David Yates", "Fantasia");
		Bluray matrix = new Bluray("Matrix", "Lana & Andy Wachowski", "Ficção Científica");

		if(lotr.compararDiretor(animFant))
			System.out.println("São do mesmo diretor");
		else
			System.out.println("Não são do mesmo diretor");

		if(guerCiv.compararAutor(logan))
			System.out.println("São do mesmo autor");
		else
			System.out.println("Não são do mesmo autor");

		System.out.println("");

		Colecao col = new Colecao();

		col.inserirQuadrinho(guerCiv);
		col.inserirQuadrinho(lanVerm);
		col.inserirQuadrinho(logan);

		col.inserirBluray(lotr);
		col.inserirBluray(kingKong);
		col.inserirBluray(animFant);
		col.inserirBluray(matrix);

		System.out.println("A coleção tem " + col.tamanho() + " itens.");
		System.out.println("Sendo " + col.numQuadrinhos() + " quadrinho(s) e " + col.numBlurays() + " Blu-ray(s)");
		System.out.println("");
		col.listarQuadrinhosAutor("Mark Millar");
		System.out.println("");
		col.listarQuadrinhosGenero("Ação");
		System.out.println("");
		col.listarBluraysDiretor("David Yates");
		System.out.println("");
		col.listarBluraysGenero("Comédia");
		System.out.println("");
		col.listarBluraysGenero(matrix);
		System.out.println("");
		col.listarBluraysDiretor(kingKong);
		System.out.println("");
		col.listarQuadrinhosGenero(logan);
		System.out.println("");
		col.listarQuadrinhosAutor(lanVerm);
	}
}