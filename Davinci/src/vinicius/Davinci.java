package vinicius;

import javax.swing.JOptionPane;

public class Davinci {

	public static void main(String[] args) {

		int valores[] = { 9, 3, 1, 2, 5 }, a = 0,b;
		
		try{
	    	a = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero inteiro "));
	    	JOptionPane.showMessageDialog(null, "Valor válido ! ");
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Valor inválido digite novamente !");
		}
		
		b = (int) (Math.random() * valores.length);
		int c = a * valores[b];
		JOptionPane.showMessageDialog(null, c);
		
		
	}

	
	
}
