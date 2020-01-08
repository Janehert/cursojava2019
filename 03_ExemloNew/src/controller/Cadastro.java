package controller;
import model.Usuario;
public class Cadastro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Usuario user = new Usuario();
	   user.nome="Marcelo";
	   user.endereco="Rua sem fim, 72";
	   user.idade=46;
	   System.out.println(user.nome); 
	   System.out.println(user.endereco );
	   System.out.println(user.idade);
	   }
}
	