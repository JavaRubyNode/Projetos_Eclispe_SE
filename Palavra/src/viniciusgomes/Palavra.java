package viniciusgomes;

import javax.swing.JOptionPane;

public class Palavra {

	/** 2) Dado o seguinte trecho de c�digo Java:

String frase = "Gosto muito de Java";
System.out.println(frase);

a) Mostre a quantidade de caracteres na frase (incluindo os espa�os);
b) Mostre a quantidade de espa�os;
c) Mostre a quantidade de palavras na frase;
d) Mostre a quantidade de letras mai�sculas;
e) Mostre quantas vezes a letra "o" aparece na frase.

	 * 
	 */
	
	public static void main(String[] args) {
	int charca=0,espa�o=0,maiscula=0,o=0;
	
String a = JOptionPane.showInputDialog(" Digite uma frase ou palavra ");
String[] palavras = a.split("");

for (int i=0;i < a.length();i++){
	charca = a.length();
	if (a.charAt(i) =='o'){
		o++;
	}
	if (a.charAt(i) == espa�o){
		espa�o++;
	}
	if (Character.isUpperCase(a.charAt(i))== true){
		maiscula++;
	}
}
JOptionPane.showMessageDialog(null," A Quantidade de caracteres na frase ser� = "+charca+
		"\n A Quantidade de espa�os na frase ser� = " +espa�o+"\n A Quantidade de letras \"O\" na frase ser� = "+o+
		"\n A Quantidade de letras maisculas na frase ser� = "+maiscula+
		"\n A Quantidade de palavras na frase ser� = "+palavras.length);





	}

}
