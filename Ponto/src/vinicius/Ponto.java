package vinicius;

import javax.swing.JOptionPane;

public class Ponto {

	public static void main(String[] args) {

		float a, b, c, d, x, y=0, w, i,l,m;

		a = Float.parseFloat(JOptionPane
				.showInputDialog(" Sendo os pontos de uma reta ( a , b ),\n"
						+ " Digite o valor de \" A\""));
		b = Float.parseFloat(JOptionPane
				.showInputDialog(" Sendo os pontos de uma reta ( a , b ),\n"
						+ " Digite o valor de \" B\""));
		c = Float.parseFloat(JOptionPane
				.showInputDialog(" Sendo os pontos de uma reta ( c , d ),\n"
						+ " Digite o valor de \" C\""));
		d = Float.parseFloat(JOptionPane
				.showInputDialog(" Sendo os pontos de uma reta ( c , d ),\n"
						+ " Digite o valor de \" D\""));
		
		i = ((d - b) / (c - a));
		l = (a - c);
		m = (b - d);
		w = (l * l) + (m * m);  
		 
		x = ((y-b)/(a));
		y = ((a*x)+(b)); 
         
		JOptionPane.showMessageDialog(null," Dados os pontos a Equa��o sera assim "+" y = "+y+" x "+x); 
		
		
		JOptionPane.showMessageDialog(null,
				" A dist�ncia entre os pontos ( a , b ) e ( c , d ) ser� = "
						+ Math.sqrt(w));

		
		JOptionPane
				.showMessageDialog(null, " A inclina��o da reta ser� = " + i);

	}

}
