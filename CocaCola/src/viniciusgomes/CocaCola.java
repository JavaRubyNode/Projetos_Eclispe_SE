package viniciusgomes;

import javax.swing.JOptionPane;

public class CocaCola {

	/** A f�brica de refrigerantes Meia-Cola vende seu produto em tr�s formatos: lata de 350 ml, 
	 * garrafa de 600 ml e garrafa de 2 litros.
	 * 
	 */
	public static void main(String[] args) {
		double x,y,z;
		
		double lata = Double.parseDouble(JOptionPane.showInputDialog(" Informe a quantidade de caixa de lata 350ml ( c/ 12 unid.)"));
double garrafa = Double.parseDouble(JOptionPane.showInputDialog(" Informe a quantidade de caixa de garrafa 600ml (c/ 12 unid.) "));
double litro = Double.parseDouble(JOptionPane.showInputDialog(" Informe a quantidade de caixa de garrafa 2 litros (c/ 06 unid."));

x = (((lata*12)*350)*1000);
y = (((garrafa*12)*600)*1000);
z = ((litro*6)*2);

JOptionPane.showMessageDialog(null," Quantidade em litros de lata ser� = "+x+"\n Quantidade em litros de garrafa 600ml ser� = "+y+
		"\n Quantidade em litros de garrafa de 2 litros ser� = "+z+"\n Quantidade total comprada foi de "+(x+y+z)+" litros ");


	}

}
