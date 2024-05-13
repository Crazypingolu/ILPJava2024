/*
 * Programa: calcular a sequencia: 1/1 + 1/2 + ... + 1/n ; usando recursiva
 * Programador: LucasPOliveira
 * vers�o: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex03Recursiva {
	// c�digo principal:
	public static void main(String[] args) {
		// criar/deifinir vari�veis:
		float num;
		// entrada de dados:
		num = Float.parseFloat(JOptionPane.showInputDialog("Digite num: "));
		// sa�da de dados:
		JOptionPane.showMessageDialog(null, "A soma da sequ�ncia 1/1 + 1/2 + ... + 1/n �: " + umSobreN(num));
	}
	// c�digo da fun��o recursiva:
	static float umSobreN(float n) {
		// definir vari�veis:
		float total;
		// processamento de dados:
		// condi��o de sa�da:
		if (n == 1) {
			return 1;
		} else {
			total = 1/n + umSobreN(n-1);
			return total;
		}
	}
}
