package controller;

public class FatorialController {
		
	public FatorialController() {
	 super();
}

	public int fat(int numfat) {
		//Condi��o de parada = 1
       
		if (numfat == 1) {
			return 1;
		} 
		else {		
		}
		return numfat * fat(numfat - 1);
	}
	
}