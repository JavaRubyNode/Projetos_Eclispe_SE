package vinicius;

import javax.swing.JOptionPane;

public class Sistema {

	// calcular qualquer sistema linear de 1� grau com 2 variaveis 
// sendo valores dentro do conjunto do reais n�o nulo 	
	
	public static void main(String[] args) {
	float a,b,c,d,e,f,x,y;
	
	a = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o x da 1� equa��o "));
	b = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o y da 1� equa��o "));
	c = Float.parseFloat(JOptionPane.showInputDialog(" Informe o resultado da 1� equa��o "));
	
	d = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o x da 2� equa��o "));
	e = Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor que acompanha o y da 2� equa��o "));
	f = Float.parseFloat(JOptionPane.showInputDialog(" Informe o resultado da 2� equa��o "));	
		
		x = (((c*e)-(b*f)) / ((a*e)-(b*d)));
		y = (((a*f)-(c*d)) / ((a*e)-(b*d)));
		
		JOptionPane.showMessageDialog(null," o valor de x = "+ x +"\n o valor de y = "+y);
	}

}
