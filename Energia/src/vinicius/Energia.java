package vinicius;

import javax.swing.JOptionPane;

public class Energia {

	
	public static void main(String[] args) {
		
		double m,c,e;
		m = Double.parseDouble(JOptionPane.showInputDialog(" digite a massa em (gramas) "));
	c =(double)(Math.pow(10,8)*3);
	e = (m*(c*c)); 	
	
	JOptionPane.showMessageDialog(null," A energia gerada apartir da massa e = "+ e +" em joules ");
		
		
	}

}
