package victorhugo;

import javax.swing.JOptionPane;

public class Nomes {

	/**
	 * 1) Dada a matriz abaixo e usando laços for, while ou do...while:
	 * 
	 * int valores[] = {4, 12, 3, 7, 10, 8, 1, 9};
	 * 
	 * a) Mostre a soma dos elementos; b) Mostre a quantidade de elementos
	 * pares; c) Mostre a média dos elementos ímpares; d) Mostre a quantidade de
	 * valores MENORES que 10; e) Leia um valor e verifique se o mesmo está
	 * contido na matriz.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int soma1 = 0, soma2 = 0, soma3 = 0, cont = 0, media = 0, cont1 = 0, cont3 = 0;

		int valores[] = { 4, 12, 3, 7, 10, 8, 1, 9 };
		float a = Float
				.parseFloat(JOptionPane
						.showInputDialog(" Digite um número para testar se está contido na matriz "));
		boolean encontrado = false;

		for (int i = 0; i < valores.length; i++) {
			if (a == valores[i]) {
				encontrado = true;
				break;
			}
		}

		if (encontrado == true) {
			JOptionPane.showMessageDialog(null, " O numero " + a
					+ " esta contido na matriz ");
		} else {

			JOptionPane.showMessageDialog(null, " O numero " + a
					+ " não esta contido na matriz ");
		}

		for (int i = 0; i < valores.length; i++) {
			soma1 = soma1 + valores[i];

			if (valores[i] < 10) {
				cont3++;
			}
			if (valores[i] % 2 == 0) {
				cont1++;
				soma2 = soma2 + valores[i];

			}

			if (valores[i] % 2 != 0) {
				cont++;
				soma3 = soma3 + valores[i];
				media = ((soma3) / cont);
			}

		}

		JOptionPane.showMessageDialog(null, " Soma sera da matriz = " + soma1
				+ "\n soma do numeros pares = " + soma2
				+ " \n Soma de numeros impares = " + (soma3)
				+ " \n Media de numeros impares = " + (media - 1)
				+ "\n Quantidade de numeros menores que 10 = " + cont3);
	}

}
