package model;

public class Animal {
	
	private int idDono;
	private int idFicha;
	private String classificacao;
	private String raca;
	private String dataNasc;
	private Ficha ficha;
	
	public Animal(int idDono, int idFicha, String classificacao, String raca, String dataNasc, Ficha ficha) {
		super();
		this.idDono = idDono;
		this.idFicha = idFicha;
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNasc = dataNasc;
		this.ficha = ficha;
	}

	public int getIdDono() {
		return idDono;
	}

	public void setIdDono(int idDono) {
		this.idDono = idDono;
	}

	public int getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(int idFicha) {
		this.idFicha = idFicha;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
}
