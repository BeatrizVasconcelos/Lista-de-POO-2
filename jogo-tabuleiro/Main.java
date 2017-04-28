import java.util.ArrayList;
public class Main {

	public static void main(String[] args){

		ArrayList<JogoTabuleiro> jogos = new ArrayList<>();
		JogoTabuleiro banco = new BancoImobiliario();
		JogoTabuleiro war = new War();

		jogos.add(banco);
		jogos.add(war);

		for(JogoTabuleiro jogo : jogos){
			System.out.println("Como jogar " + jogo.getNome() + ':');
			jogo.jogar();
			System.out.println("");
		}
	}
}