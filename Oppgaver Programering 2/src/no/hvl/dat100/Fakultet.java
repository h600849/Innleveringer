package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 

public class Fakultet {

	public static void main(String[] args) {
		
		String fakultet = showInputDialog("Skriv inn ditt ønsket fakultet: ");
		int n = Integer.parseInt(fakultet);
		int x = 1;
		
		for (;n > 0; n--) {
			
			x = n*x;
		}
		
		showMessageDialog(null, "Fakultet " + fakultet  + " er " + x); 
	}

}
   