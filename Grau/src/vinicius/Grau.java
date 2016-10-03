package vinicius;

import javax.swing.JOptionPane;

public class Grau {

	public static void main(String[] args) {

		float a = Float
				.parseFloat(JOptionPane
						.showInputDialog(" Dada a Equação ( f(x) = ax + b ), de o valor de \"A\""));
		float b = Float
				.parseFloat(JOptionPane
						.showInputDialog(" Dada a Equação ( f(x) = ax + b ), de o valor de \"B\""));
		int c = Integer
				.parseInt(JOptionPane
						.showInputDialog(" Digite quantas vezes voce quer dar valor a \" X\""
								+ " para achar \"Y\""));

		for (int i = 0; i < c; i++) {

			float x = Float
					.parseFloat(JOptionPane
							.showInputDialog(" Dada a Equação ( f(x) = ax + b ), de o valor de \"X\""));
			float d = Float
					.parseFloat(JOptionPane
							.showInputDialog(" Dada a Equação ( f(x) = x² ), de o valor de \"X\""));

			float z = d * d;
			float y = ((a * x) + b);

			JOptionPane.showMessageDialog(null,
					" O valor de Equação ( f(x) = ax + b ) = " + y);
			JOptionPane.showMessageDialog(null,
					" O valor de Equação ( f(x) = x² ) = " + z);

		}

	}

}
