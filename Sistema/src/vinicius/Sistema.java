package vinicius;

import javax.swing.JOptionPane;

public class Sistema {

	// calcular qualquer sistema linear de 1° grau com 2 variaveis 
// sendo valores dentro do conjunto do reais não nulo 	
	
	public static void main(String[] args) {
	float a,b,c,d,e,f,x,y;
	
	a = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o x da 1° equação "));
	b = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o y da 1° equação "));
	c = Float.parseFloat(JOptionPane.showInputDialog(" Informe o resultado da 1° equação "));
	
	d = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o x da 2° equação "));
	e = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o y da 2° equação "));
	f = Float.parseFloat(JOptionPane.showInputDialog(" Informe o resultado da 2° equação "));	
		
		x = (((c*e)-(b*f)) / ((a*e)-(b*d)));
		y = (((a*f)-(c*d)) / ((a*e)-(b*d)));
		
		JOptionPane.showMessageDialog(null," o valor de x = "+ x +"\n o valor de y = "+y);
	}

}
