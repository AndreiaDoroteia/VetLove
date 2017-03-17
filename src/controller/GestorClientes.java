package controller;
import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;


public class GestorClientes {
	Scanner sc = new Scanner(System.in);
	
	
	ArrayList <Cliente> arrClientes;
	public GestorClientes(){
		arrClientes = new ArrayList<>();	
	}
	public Cliente consultaCliente(){
		
		System.out.print("Insira id a pesquisar:");
		int id= sc.nextInt();	
		
		for(int i=0; i<arrClientes.size();i++){
			if (arrClientes.get(i).getId() == id) 
				return arrClientes.get(i);
		}
		return null;	
	}
	
	public void mostraCliente(){
		if (consultaCliente()!= null){
			Cliente cliente = consultaCliente();
			System.out.printf("ID: %d", cliente.getId());
			System.out.printf("Nome: %s", cliente.getNome());
			System.out.printf("Morada: %s", cliente.getMorada());
			System.out.printf("Email: %s", cliente.getEmail());
			System.out.printf("Telefone: %d", cliente.getTelefone());
		}
	}
	
	public void addCliente(){
		int id;
		String nome;
		String morada;
		String email;
		int tel;
		id=arrClientes.size();
		System.out.print("Insira nome:");
		nome = sc.nextLine();
		System.out.print("Insira morada:");
		morada = sc.nextLine();
		System.out.print("Insira email:");
		email = sc.nextLine();
		System.out.print("Insira telefone:");
		tel= sc.nextInt();		
		Cliente cli = new Cliente(id,nome,morada,email,tel) ; 
		arrClientes.add(cli);
		
	}

}
