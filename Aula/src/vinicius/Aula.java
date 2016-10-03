package vinicius;

import javax.swing.JOptionPane;

public class Aula {

	
	public static void main(String[] args) {
		int valores [] ={9,3,17,100,3,4,8,250};
		
		int maior = valores[0];
		
		for ( int i=0;i<valores.length;i++){
		
			
			if(valores[i]>maior){
				maior = valores[i];
				
				
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null," O maior valor será = "+ maior);

	}

}
