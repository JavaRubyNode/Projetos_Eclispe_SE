package org;

import javax.swing.JOptionPane;

public class Mar {

	public static void main(String[] args) {
		int valores[] = { 9, 4, 3, 10, 11, 18 };
		int a;
		boolean encontrado = false;

		a = Integer.parseInt(JOptionPane
				.showInputDialog(" digite um numero a ser testado "));
		for (int i = 0; i < valores.length; i++) {
			if (a == valores[i]) {
				encontrado = true;
				break;
			}
		}

		if (encontrado == true) {
			JOptionPane.showMessageDialog(null,
					" O numero" + a +" esta contido na matriz ");
		} else {

			JOptionPane.showMessageDialog(null,
					" O numero " + a+ " não esta contido na matriz ");
		}

	}

}
