package model;

public class Vacina {
	
	private String data;
	private String nomeVacina;
	private double preco;
	
	public Vacina(String data, String nomeVacina, double preco) {
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
