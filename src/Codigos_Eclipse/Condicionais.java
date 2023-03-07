/**
 * 
 */
package Codigos_Eclipse;

/**
 * @author 01
 *
 */
public class Condicionais {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Transcreva esse código para algoritmo
		
		// main + ctrl + space = psvm
		//ifelse + '' = if(){}else() 
		//sys / sysout + '' = sout
		
		//é possivel rodar esse código para teste
		
		int idade = 17;
		
		int lifes; //quantidade de vidas do personagem
		//int OxygenBl; //bolhas que aparecem caso esteja submerso na água
		
		
		
		if (idade < 18) {	//se a idade for menor que 18, escreva:
			System.out.println("Voce e menor de idade, nao pode beber");
		} else { //caso contrário, escreva:
			System.out.println("Voce esta permitido a beber");
		}
		
		lifes = 10;
		//OxygenBl = 10;
		
		//estrutura for em breve...
		
		if (lifes <= 0) { //se as vidas chegarem a zero:
			System.out.println("Game Over");
		} else { //senão:
			System.out.println("Ainda ta vivo");
		}
	
		
	}

}
