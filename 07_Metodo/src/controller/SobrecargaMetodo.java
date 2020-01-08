package controller;

public class SobrecargaMetodo {
 int idade;
 String nome;
 double cpf;
		public void cadastrarPessoa (int valor) { 
			idade = valor;
		}
			
	public void cadastrarPessoa ( String valor) {
		nome = valor;
		System.out.println("Nome:" + nome );
	}	
		public void cadastrarPessoa ( double valor) {
		cpf = valor;
		System.out.println("Cpf:" + cpf );
	}
	
	public void cadastrarPessoa (int valor1, String valor2) {
	idade = valor1; 
	nome= valor2;	
	System.out.println("Idade: " + idade  +" -Nome : " + nome );
	}
	public static void main(String[] args) {
	SobrecargaMetodo scm = new SobrecargaMetodo();
	scm.cadastrarPessoa (28);
	scm.cadastrarPessoa ("Michelael Ferreira");
	scm.cadastrarPessoa (35, "Fabricio Gomes");
	}
	
 
}
