public class Item {

	protected String nome;
	protected String material;
	protected double valor;

	public String getNome(){
		return this.nome;
	}

	public String getMaterial(){
		return this.material;
	}

	public double getValor(){
		return this.valor;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setMaterial(String material){
		this.material = material;
	}

	public void setValor(double valor){
		this.valor = valor;
	}

	@Override
	public String toString(){
		return this.nome;
	}
}