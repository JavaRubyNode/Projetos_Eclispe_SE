package alfa;

import javax.swing.JOptionPane;

public class Alfa {
	// calcular o logaritmo de um resultado de um fun��o exponcial

	public static void main(String[] args) {

		Float a, b, c;

		a = Float.parseFloat(JOptionPane
				.showInputDialog(" Informe a base da fun��o Exponencial "));
		b = Float.parseFloat(JOptionPane
				.showInputDialog(" Informe o exponte da fun��o Exponencial "));
		c = (float) Math.pow(a, b);

		JOptionPane.showMessageDialog(null, " A exponencia��o de " + a
				+ " elevando " + b + " = " + c + "\n O log de " + c
				+ " na base 10 sera = " + (Math.log10(c)));

		
		
		
		
	}

}
