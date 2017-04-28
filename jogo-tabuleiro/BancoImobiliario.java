public class BancoImobiliario extends JogoTabuleiro {

	private String cenario;
	private double saldoBanco;

	public BancoImobiliario(){
		this.nome = "Banco Imobiliário";
	}

	public String getCenario(){
		return this.cenario;
	}

	public double getSaldoBanco(){
		return this.saldoBanco;
	}

	public void setCenario(String cenario){
		this.cenario = cenario;
	}

	public void setSaldoBanco(double saldo){
		this.saldoBanco = saldo;
	}

	public void emprestar(double emprestimo){
		if(this.saldoBanco >= emprestimo && emprestimo > 0 && this.saldoBanco > 0)
			this.saldoBanco -= emprestimo;
	}

	public void cobrar(double valor){
		this.saldoBanco += valor;
	}

	@Override
	public void jogar(){
		System.out.println("O jogador da vez joga o dado e anda o número de casas indicado por ele.");
		System.out.println("Caso pare em uma propriedade sem dono, o jogador poderá comprá-la.");
		System.out.println("Se houver dono, deverá pagar um aluguel ao dono. (O aluguel varia pra cada propriedade)");
		System.out.println("Caso o próprio jogador seja o dono (e também possua todas as propriedades da mesma cor) poderá pagar para construir casas e aumentar o valor do aluguel.");
		System.out.println("O último jogador a falir ganha.");
	}
}