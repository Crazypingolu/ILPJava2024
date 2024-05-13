package lotedejava1p1;
/*
 *Programa: Calcular o Volume
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
import javax.swing.JOptionPane;
public class Ex07Lote1p1 {
	public static void main(String args[]) {
		// Declarar variável
		float a,b,c,vol;
		// Entrada de dados:
		a = Float.parseFloat(JOptionPane.showInputDialog("Valor de 'a': "));
		b = Float.parseFloat(JOptionPane.showInputDialog("Valor de 'b': "));
		c = Float.parseFloat(JOptionPane.showInputDialog("Valor de 'c': "));
		// Processamento de Dados:
		vol = a*b*c;
		// Saída de dados:
		JOptionPane.showMessageDialog(null, "O volume é: " + vol);
	}
}
