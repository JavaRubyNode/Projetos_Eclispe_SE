package viniciusgomes;

import javax.swing.JOptionPane;

public class Meses {

	/**  
	 * Escreva um trecho de c�digo Java que pe�a ao usu�rio que informe o m�s de seu
nascimento como um n�mero inteiro e use-o como �ndice para obter o nome do m�s
na matriz e exib�-lo. Por exemplo, se o usu�rio informar o valor 4, seu c�digo dever�
mostrar a mensagem:
 
	 */
	
	public static void main(String[] args) {

		int mes=0;
		
		String meses[] = {"JANEIRO", "FEVEREIRO", "MAR�O", "ABRIL", "MAIO", 
"JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};

		mes = Integer.parseInt(JOptionPane.showInputDialog(" Informe a numero do m�s que voc� nasceu "));

for (int i=0; i<= meses.length;i++){
	
	if (mes == i){
		
		JOptionPane.showMessageDialog(null, " Voce nasceu no M�s "+ meses[i-1]);
	}
	
	}
	


	}

}
