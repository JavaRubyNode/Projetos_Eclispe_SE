package blue;

import javax.swing.JOptionPane;

public class Blue {
// calcular o salario baseado nas horas extras acima de 40 por semana 
	
	public static void main(String[] args) {
		float sal, val;

		int i, soma = 0, cont = 0, horas = 0;

		sal = Float.parseFloat(JOptionPane
				.showInputDialog(" Digite o salario do funcionario "));

		for (i = 0; i < 4; i++) {
			horas = Integer
					.parseInt(JOptionPane
							.showInputDialog(" Digite a quantidade de horas trabalhadas "
									+ (i + 1) + " semana"));
			soma = soma + horas;

		}

		if (soma > 160) {

			cont = soma - 160;
			val = sal / 528;
			JOptionPane.showMessageDialog(null, " O salario sera = "
					+ (((val * 1.5) * cont)+sal));
		}else{
			JOptionPane.showMessageDialog(null," O salario sera = " + sal);
		}
		

		JOptionPane.showMessageDialog(null, " A quantidade de horas extras = "
				+ cont);

	}

}
