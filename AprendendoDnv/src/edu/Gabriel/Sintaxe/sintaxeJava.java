package edu.Gabriel.Sintaxe;

public class sintaxeJava {
	
	public static void main(String [] args) {
	
		String primeiroNome = "Gabriel";
		String segundoNome = "Teixeira";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
