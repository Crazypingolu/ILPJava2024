package lotedejava1p1;
/*
 *Programa: inversão de valores em 2 variaveis
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
import javax.swing.JOptionPane;
public class Ex06Lote1p1 {
	public static void main(String args[]){
		// Declarar variáveis:
		int x,y,temp;
		// Entrada de dados:
		x = Integer.parseInt(JOptionPane.showInputDialog("Valor de x (int): "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Valor de y (int): "));
		// Processamento:
		temp = x;
		x = y;
		y = temp;
		// Saída:
		JOptionPane.showMessageDialog(null,"x' = "+x+"\ny' = "+y);
	}
}
