package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Leitura de texto
		String nome;
	  nome = Teclado.lerTexto( " Digite o nome do aluno : " ); 
		
	  // Leitura de inteiro	 
	  double nota01, nota02, nota03, nota04, media, media_total;
	  double media_para_passar = 7.5;
	  //double media_resto;
	  
	  nota01 = Teclado. lerDouble ( " Digite a nota01 :" );
	  nota02 = Teclado. lerDouble ( " Digite a nota02 :" );
	  nota03 = Teclado. lerDouble ( " Digite a nota03 :" );
	  nota04 = Teclado. lerDouble ( " Digite a nota04 :" );
	  
	  media_total = nota01 + nota02 + nota03 + nota04;
	  media = media_total / 4; 
	 
	  //media_resto = mdeia_total % 4;
	  System.out.println(" Nome: " + nome );
	  System.out.println(" Média: " + media );
	  if( media >= media_para_passar ) ;
	  
	  //System.out.println(" Média Resto : " + media_resto );
	  System.out.println( );
	 
	 
	 
	}

}
