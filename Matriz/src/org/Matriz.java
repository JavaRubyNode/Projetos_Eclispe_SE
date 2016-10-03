package org;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		Integer valores[] = { 9, 4, 3, 10, 11, 18 };
		Integer soma1 = 0, soma2 = 0;
		for (Integer i = 0; i < valores.length; i++) {
			soma1 = soma1 + valores[i];
			if (valores[i] % 2 == 0) {
				soma2 = soma2 + valores[i];
			}

		}
		JOptionPane.showMessageDialog(null, " Soma sera da matriz = " + soma1
				+ "\n A soma do numeros pares = " + soma2);

	}

}
