package controller;
import java.util.Calendar;

import util.Teclado;
public class ExemploEntrada {
	

	public static void main( String [] args) {
	int ano_nasc;	
	int ano_atual;
	ano_atual = Calendar.getInstance().get(Calendar.YEAR);
	
	
		//Leitura de texto
	    String nome;
	    nome = Teclado.lerTexto ( " Digite seu nome :" );
		
	 	//Leitura de texto
	    String funcoa;
	    funcoa = Teclado.lerTexto ( " Digite sua fun��o :" );    
	  
	    
    //Leitura de inteiro 
    int idade;
    idade = Teclado.lerInt ("digite sua idade : ");
    ano_nasc = ano_atual - idade;
    //Leitura de ponto Flutuante 
    double salario;
    salario = Teclado.lerDouble( "Digite seu sal�rio :" );
    
    System.out.println	(" Nome informado : " + nome );
    System.out.println	(" Idade informada : " + idade);
    System.out.println	(" Sal�rio informado : " + salario );
    System.out.println	(" Fun��o informada : " + funcoa ); 
    System.out.println	(" Ano nascimento : " + ano_nasc);
    System.out.println	("  *======  Fim  ======*  " );
    
    		}

}	
	