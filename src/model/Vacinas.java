package model;

public class Vacinas {
	
	private String data;
	private String nomeVacina;
	private float preco;
	
	public Vacinas(String data, String nomeVacina, float preco) {
		super();
		this.data = data;
		this.nomeVacina = nomeVacina;
		this.preco = preco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
