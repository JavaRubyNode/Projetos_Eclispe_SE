package vinicius;

import javax.swing.JOptionPane;

public class Juros {
// b = montande para calcular em juros compostos ( M = J-C )
// a = e a formula pra achar o montade (m=c.(1+(i)elavado ao tempo )
	
	public static void main(String[] args) {
	
		double j,i,c,t,m,a,b;
	int opc;
	
	t = Double.parseDouble(JOptionPane.showInputDialog(" Digite o tempo da aplica��o ( em meses, se for em anos converta) ")); 
	c = Double.parseDouble(JOptionPane.showInputDialog(" Digite o Valor Capital investido  "));  
i = Double.parseDouble(JOptionPane.showInputDialog(" Digite a taxa de juros da aplica��o "));

	opc = Integer.parseInt(JOptionPane.showInputDialog(" Para Juros simples digite (1) ou para Juros Compostos digite (2) "));

	while ((opc!=1)&&(opc!=2)){
		JOptionPane.showMessageDialog(null, " Op��o inv�lida digite \" 1\"" + " ou digite \" 2\"");
		opc = Integer.parseInt(JOptionPane.showInputDialog(" Para Juros simples digite (1) ou para Juros Compostos digite (2) "));
	}
	
	if ( opc==1 ){
		
		j = (c*(i/100)*t);
		m = c+j; 
	
		JOptionPane.showMessageDialog(null," O Valor do juro ser� = "+j+"\n O Valor do Montante ser� = " +m);
	
	}else{
	 
		a = (double) (c*(Math.pow(1+(i/100),t)));
		b = a - c;
	 JOptionPane.showMessageDialog(null," O valor do montade ser� = "+a+"\n O valor do Juro ser� = " +b);
	 
	}
	
	
	
	}

}
