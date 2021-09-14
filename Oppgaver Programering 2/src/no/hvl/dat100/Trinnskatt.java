package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 

public class Trinnskatt {
	
	
	public static void main(String[] args) {
		
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.132;
		double trinn4 = 0.162;
		
		String bruttoInntektTxt = showInputDialog("Bruttoinntekt?");
		
		int bruttoInntekt = Integer.parseInt(bruttoInntektTxt);
		
		if (bruttoInntekt <=260100) {
			showMessageDialog(null, "Du er på skattetrin 1, du betaler " + bruttoInntekt* trinn1 +  " kr i skatt");
		} 
		else if (bruttoInntekt >=260100 && bruttoInntekt <=651250) {
			showMessageDialog(null, "Du er på skattetrin 2, du betaler " + bruttoInntekt*trinn2 + " kr i skatt");
		}
		else if (bruttoInntekt >=651250 && bruttoInntekt <=1021550) {
			showMessageDialog(null, "Du er på skattetrinn 3, du betaler " + bruttoInntekt*trinn3 + " kr i skatt");
		}
		else if (bruttoInntekt >=1021550) {
			showMessageDialog(null, "Du er på skattetrinn 4, du betaler " + bruttoInntekt*trinn4 + " kr i skatt");
		}
 
	}

	
	

}
