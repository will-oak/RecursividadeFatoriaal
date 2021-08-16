package controller;

public class FatorialController {
		
	public FatorialController() {
	 super();
}

	public int fat(int numfat) {
		//Condição de parada = 1
       
		if (numfat == 1) {
			return 1;
		} 
		else {		
		}
		return numfat * fat(numfat - 1);
	}
	
}

/*
  a) A condição de parada = Quando chegar ao número 1, pois fatorial é até o número 1. 

  b)Como escrever a função para o termo n em função do termo anterior 
        
    Coloquei para decrementar o número enquanto ele ainda não sabe o resultado e ir fazendo as multiplicações na pilha.   
    Quando a variavel numfat chega a ponto de parada ele desfaz a pilha e soma todos os resultados, nos trazendo assim o fatorial. 
       
   
    
  */
