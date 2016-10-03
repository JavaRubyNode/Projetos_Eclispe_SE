package viniciusgomes;

import javax.swing.JOptionPane;

public class Meses {

	/**  
	 * Escreva um trecho de código Java que peça ao usuário que informe o mês de seu
nascimento como um número inteiro e use-o como índice para obter o nome do mês
na matriz e exibí-lo. Por exemplo, se o usuário informar o valor 4, seu código deverá
mostrar a mensagem:
 
	 */
	
	public static void main(String[] args) {

		int mes=0;
		
		String meses[] = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", 
"JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};

		mes = Integer.parseInt(JOptionPane.showInputDialog(" Informe a numero do mês que você nasceu "));

for (int i=0; i<= meses.length;i++){
	
	if (mes == i){
		
		JOptionPane.showMessageDialog(null, " Voce nasceu no Mês "+ meses[i-1]);
	}
	
	}
	


	}

}
