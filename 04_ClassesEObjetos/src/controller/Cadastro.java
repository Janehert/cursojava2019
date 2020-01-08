package controller;
import model.Carro;
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro01 = new Carro();
	    carro01.modelo = "Uno";		
	 	carro01.fabricante = "Fiat";
	    carro01.cor = "Branco";
	    carro01.ano = 1997;
	    
	    Carro carro02 = new Carro();
	    carro02.modelo = "Civic";		
	 	carro02.fabricante = "Honda";
	    carro02.cor = "Preta";
	    carro02.ano = 2008;
	    
	    Carro carro03 = new Carro();
	    carro03.modelo = "Corolla";		
	 	carro03.fabricante = "Toyota";
	    carro03.cor = "Prata";
	    carro03.ano = 2019;
	    
	    System.out.println("Modelo" +carro01. modelo); 
		System.out.println("Modelo" +carro02. modelo);
		System.out.println("Modelo" +carro03. modelo);
	}

}
