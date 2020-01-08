package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Pessoa pessoa = new Pessoa(); 		
pessoa.setNome	 ("Leandro Ferreira");	
pessoa.setIdade	 (28);	
pessoa.setSexo   ("Masculino");
pessoa.setCargo  (" Motorista");

Pessoa pessoa1 = new Pessoa();
pessoa1.setNome	 ("Mariana Lima");	
pessoa1.setIdade	 (32);	
pessoa1.setSexo   ("Feminino");
pessoa1.setCargo  (" Secretária");

System.out.println("Nome : " + pessoa.getNome());
System.out.println("Idade : " + pessoa.getIdade());
System.out.println("Sexo : " + pessoa.getSexo());
System.out.println("Cargo: " + pessoa.getCargo());

System.out.println("===============================");

System.out.println("Nome : " + pessoa1.getNome());
System.out.println("Idade : " + pessoa1.getIdade());
System.out.println("Sexo : " + pessoa1.getSexo());
System.out.println("Cargo: " + pessoa1.getCargo());



	}

}
