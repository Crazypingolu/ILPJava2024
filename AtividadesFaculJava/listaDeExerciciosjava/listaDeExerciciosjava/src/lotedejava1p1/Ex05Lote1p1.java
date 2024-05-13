package lotedejava1p1;
/*
 *Programa: bhaskara (2 raizes reais)
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
import javax.swing.JOptionPane;
public class Ex05Lote1p1 {
	public static void main(String args[]) {
		// Declarar variáveis:
		int a,b,c,d,r1,r2;
		// Entrada de Dados:
		a = Integer.parseInt(JOptionPane.showInputDialog("Valor de (a): "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Valor de (b): "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Valor de (c): "));
		// Processamento:
		d = (int)Math.pow(b, 2)-(4 *(a*c));
		r1 = ((-1 * b)+(int)Math.sqrt(d))/(2*a);
		r2 = ((-1 * b)-(int)Math.sqrt(d))/(2*a);
		// Saída:
		JOptionPane.showMessageDialog(null,"1º Raiz: "+r1+"\n2º Raiz: "+r2);
	}
}
