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

/*
  a) A condi��o de parada = Quando chegar ao n�mero 1, pois fatorial � at� o n�mero 1. 

  b)Como escrever a fun��o para o termo n em fun��o do termo anterior 
        
    Coloquei para decrementar o n�mero enquanto ele ainda n�o sabe o resultado e ir fazendo as multiplica��es na pilha.   
    Quando a variavel numfat chega a ponto de parada ele desfaz a pilha e soma todos os resultados, nos trazendo assim o fatorial. 
       
   
    
  */
