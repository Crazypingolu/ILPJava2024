package lotedejava1p1;
/*
 *Programa: Diferença de dois números sem if
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
// Trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex10Lote1p1 {
	public static void main(String args[]){
		// Definir variável:
		float n1, n2, r;
		// Entrada de Dados:
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite n1: "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite n2: "));
		// Processamento de dados:
		r = n1 - n2;
		// Saída de dados:
		JOptionPane.showMessageDialog(null, "R: " + r);
	}
}
