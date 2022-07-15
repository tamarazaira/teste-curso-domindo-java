package dio;

public class Animal {
	String nome;
	private int patas;
	
	public Animal(String nome, int patas) {
		super();
		this.nome = nome;
		this.patas = patas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
