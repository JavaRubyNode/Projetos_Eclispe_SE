package viniciusgomes;

import javax.swing.JOptionPane;

public class Palavra {

	/** 2) Dado o seguinte trecho de código Java:

String frase = "Gosto muito de Java";
System.out.println(frase);

a) Mostre a quantidade de caracteres na frase (incluindo os espaços);
b) Mostre a quantidade de espaços;
c) Mostre a quantidade de palavras na frase;
d) Mostre a quantidade de letras maiúsculas;
e) Mostre quantas vezes a letra "o" aparece na frase.

	 * 
	 */
	
	public static void main(String[] args) {
	int charca=0,espaço=0,maiscula=0,o=0;
	
String a = JOptionPane.showInputDialog(" Digite uma frase ou palavra ");
String[] palavras = a.split("");

for (int i=0;i < a.length();i++){
	charca = a.length();
	if (a.charAt(i) =='o'){
		o++;
	}
	if (a.charAt(i) == espaço){
		espaço++;
	}
	if (Character.isUpperCase(a.charAt(i))== true){
		maiscula++;
	}
}
JOptionPane.showMessageDialog(null," A Quantidade de caracteres na frase será = "+charca+
		"\n A Quantidade de espaços na frase será = " +espaço+"\n A Quantidade de letras \"O\" na frase será = "+o+
		"\n A Quantidade de letras maisculas na frase será = "+maiscula+
		"\n A Quantidade de palavras na frase será = "+palavras.length);





	}

}
