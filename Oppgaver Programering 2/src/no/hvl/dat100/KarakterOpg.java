package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 


public class KarakterOpg {

	public static void main(String[] args) {
		
		final int ANT_ELEVER = 10;
		for (int elevNr = 1; elevNr <= ANT_ELEVER; elevNr++) {
		
			String poengTxt = showInputDialog("Hvor mange poeng fikk du?");
			int poeng = Integer.parseInt(poengTxt);
		
			if (poeng >=0 && poeng <=39) {
				showMessageDialog(null, "Din karakter er F");
			}
			else if (poeng >=40 && poeng <=49) {
				showMessageDialog(null, "Din karakter er E");
			}
			else if (poeng >= 50 && poeng <= 59) {
				showMessageDialog(null, "Din karakter er D");
			}
			else if (poeng >= 60 && poeng <= 79) {
				showMessageDialog(null, "Din karakter er C");
			}
			else if (poeng >= 80 && poeng <= 89) {
				showMessageDialog(null, "Din karakter er B");
			}
			else if (poeng >= 90 && poeng <= 100) {
				showMessageDialog(null, "Din karakter er A");
			}
			
			else {
				showMessageDialog(null, "Ugyldig poengsum");
					elevNr--;
			}
		}
	}

} 
