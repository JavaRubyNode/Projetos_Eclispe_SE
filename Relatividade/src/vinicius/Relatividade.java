package vinicius;

import javax.swing.JOptionPane;

public class Relatividade {

	
	public static void main(String[] args) {
		double trel,tp,c,z;
		
		c = (double) (Math.pow(10,8)*3);
		
		tp = Double.parseDouble(JOptionPane.showInputDialog(" Digite o tempo real no presente momento "));
		
		z = (1-(0.8*(c*c)/(c*c)));
		trel = (tp/(Math.sqrt(z)));
		JOptionPane.showMessageDialog(null," O tempo relativo sera = "+c);

	}

}
