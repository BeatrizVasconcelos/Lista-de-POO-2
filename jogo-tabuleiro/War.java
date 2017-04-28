public class War extends JogoTabuleiro {

	private String cenario;

	public War(){
		this.nome = "War";
	}

	public String getCenario(){
		return this.cenario;
	}

	public void setCenario(String cenario){
		this.cenario = cenario;
	}

	@Override
	public void jogar(){
		System.out.println("Cada jogador recebe um objetivo, alguns territórios e tropas.");
		System.out.println("O jogador espalha suas tropas pelos seus territórios como desejar.");
		System.out.println("No seu turno, o jogador pode atacar territórios inimigos vizinhos aos seus para conquistá-los.");
		System.out.println("Ganha o jogador que alcançar primeiro seu objetivo.");
	}
}