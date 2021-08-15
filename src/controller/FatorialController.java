package controller;

public class FatorialController {
		
	public FatorialController() {
	 super();
}

	public int fat(int entrada, int saida) {
		//Condição de parada = 1
       int armaz = 0; 
		if (entrada == 1) {
			return 0;
		} 
		
		else {
			armaz = entrada * (entrada - 1);
			
		}
		return saida + fat(entrada - 1, saida+armaz);
	}
	
}