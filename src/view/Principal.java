package view;
import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main (String[] args) {
		
		
	    int numfat;
	    FatorialController dc = new FatorialController();
	    
	    do {
	    	numfat = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número do Fatorial",JOptionPane.QUESTION_MESSAGE));
	    }   while (numfat <= 0 || numfat > 12 );{
	    	   		    }
	    
	    
	    
	    int fat = dc.fat(numfat);
		System.out.println(fat);
		
	}

}