package view;
import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main (String[] args) {
		
		
	    int entrada;
	    
	    
	    entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número do Fatorial",JOptionPane.QUESTION_MESSAGE));
	    while (entrada > 12){
	    	entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente o número do Fatorial",JOptionPane.QUESTION_MESSAGE));
	    		    }
	    
	    
	    FatorialController dc = new FatorialController();
	    int saida = 0;
		int fat = dc.fat(entrada, saida);
		System.out.println(fat);
		
	}

}