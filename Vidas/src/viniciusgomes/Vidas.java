package viniciusgomes;

import javax.swing.JOptionPane;

public class Vidas {

	/**
	 * Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir
	 * quantos dias de vida ela possui converta a idade em horas vividas.
	 */

	public static void main(String[] args) {

		long dir, masc;
		String nome = JOptionPane.showInputDialog(" Digite seu nome ");
		long ano = Long.parseLong(JOptionPane
				.showInputDialog(" Informe a sua idade "));
		long dias = ano * 365;
		long horas = dias * 24;

		masc = Long
				.parseLong(JOptionPane
						.showInputDialog(" Sendo Homem digite (1), Sendo Mulher digite (2) "));

		while ((masc != 1) && (masc != 2)) {
			JOptionPane.showMessageDialog(null, " Opção inválida digite \" 1\""
					+ " ou digite \" 2\"");
			masc = Long
					.parseLong(JOptionPane
							.showInputDialog(" Se for do sexo Masculino digite (1), Se for do sexo Feminino digite (2) "));
		}

		if (masc == 1) {
			dir = 75 - ano;
			JOptionPane
					.showMessageDialog(null,
							"Sendo homem a média de vida é de 75 anos,\n ainda lhe resta "
									+ dir + " anos \n isso equilave em dias = "
									+ (dir * 365));
		} else {
			JOptionPane.showMessageDialog(null,
					" Sendo mulher a média de vida e de 65 anos,\n ainda lhe resta "
							+ (65 - ano) + " anos \n isso equivale em dias "
							+ ((65 - ano) * 365));
		}

		JOptionPane.showMessageDialog(null, nome + ",\n Voce já viveu " + dias
				+ " dias \n " + nome + ", \n Você viveu " + ano
				+ " anos em horas = " + horas+ "\n e em segundos = "+(horas*3600));

	}

}
