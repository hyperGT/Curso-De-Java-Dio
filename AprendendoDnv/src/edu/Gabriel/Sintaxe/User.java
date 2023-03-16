package edu.Gabriel.Sintaxe;

/**
 * <h1>User</h1>
 * <p>User é o usuário, e neste código está toda a interação que é possível ser feita</p>
 * <b>Note:</b><span> Código para interação com a smart Tv</span>
 * */


public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTvControl smartTv = new SmartTvControl();
		
		smartTv.mudarCanal(14);
		System.out.println("canal: "+ smartTv.canal);
		smartTv.diminuirCanal();
		System.out.println("canal: "+ smartTv.canal);
		
		
		
		smartTv.ligarTv();
		System.out.println("Ligada: " + smartTv.ligada);
		
		smartTv.diminuirVolume();
		System.out.println("volume: "+ smartTv.volume);
		
	}

}
