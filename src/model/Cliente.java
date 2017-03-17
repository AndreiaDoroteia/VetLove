package model;

public class Cliente {
	
	private int id;
	private String nome;
	private String morada;
	private String email;
	private int telefone;
	Animal animal;
	
	public Cliente(int id, String nome, String morada, String email, int telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

		
}
