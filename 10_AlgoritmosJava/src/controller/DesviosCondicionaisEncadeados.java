package controller;
import util.Teclado;
public class DesviosCondicionaisEncadeados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       double sal, salNovo;		
	   sal = Teclado.lerDouble( "Digite o Saláriio" );
	   
	   // Teste se ganha abaixo de 500
	  	   if ( sal < 500 ) {
	   salNovo = sal * 1.15 ;
	   
		// Teste se ganha acima de 500 até 1000  
	   } else {
		   if (sal <= 1000 ) {
			 salNovo = sal * 1.10 ;
			 
		// Teste se ganha acima de 1000	 
		   }else {
			  salNovo = sal * 1.05 ;
		   }
		   }
	   System.out.println ("O salário com reajuste é : " + salNovo);
		
	}

}