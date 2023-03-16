package edu.Gabriel.Sintaxe;

/**
 * <h1>SmartTvControl</h1>
 * <p>Esta classe abriga todas as possibilidades de uma smart Tv, pelo 
 * menos as mais básicas.</p>
 * <b>Passe o mouse em cima do que precisar para entender o código</b>
 * 
 * @author gbx
 * @version 0.1
 * @since 16/03/2023
 * */


public class SmartTvControl {
	

	//vamos utilizar POO
		
		boolean ligada = false;
		int canal = 0;
		int volume = 50;
	
		
	public void ligarTv() {
		ligada = true;
	}
	public void desligarTv() {
		ligada = false;
	}
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	
	
	
	
	
	
	

}
