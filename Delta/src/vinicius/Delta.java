package vinicius;

import javax.swing.JOptionPane;

public class Delta {
// calcular as raizes,  da equação do 2º, o x / y do vertice e uma coorelação entre triângulo e retângulo 
	
	public static void main(String[] args) {
		double a,b,c,x1,x2,xv,yv,delta;

a = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor de A da equacação 2° grau "));
b = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor de B da equacação 2° grau "));		
c = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor de C da equacação 2° grau "));		
		
		delta= ((b*b)-(4*a*c));
		
		xv = (-(b)/(2*a));
		yv = (-(delta)/(4*a));

x1 =(double) ((-b+Math.sqrt(delta))/(2*a));
x2 =(double) ((-b-Math.sqrt(delta))/(2*a));		
		
if(delta<0){
JOptionPane.showMessageDialog(null," Sendo Delta = " + delta+ " não tem soluçao no campo dos Reais");	
JOptionPane.showMessageDialog(null," O valor de Xv =  "+ xv +" \n valor de Yv = "+ yv);

}else{
JOptionPane.showMessageDialog(null," O valor de delta = " + delta + "\n O valor de X1 = " 
+ x1 + "\n O valor de X2 = " + x2);
JOptionPane.showMessageDialog(null," O valor de Xv = "+ xv +"\n O valor de Yv = " + yv);

}
if((x1 > 0)&(x2 > 0)||(xv > 0)&(yv > 0)){
	JOptionPane.showMessageDialog(null," Os valores das raizes " + x1 + " e " + x2 + 
			"\n Corresponde aos lados de um retangulo"+ "\n sendo sua Area = "+(x1*x2));
	
	JOptionPane.showMessageDialog(null," O valor de Xv =  "+ xv +" e o valor de Yv = "+ yv +
			"\n Corresponde a altura e base de um triangulo"+ " \n sendo sua Area = "+((xv*yv)/2));
	
}


	}

}
