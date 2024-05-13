/* Programa: calcular a sequencia: n + (n-1) + ... + (1); usando recursiva
 * Programador: LucasPOliveira
 * vers�o: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex02Recursiva {
	// C�digo: princial
	public static void main(String[] args) {
		// criar/definir vari�veis:
		int num;
		// entrada de dados:
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de num: "));
		// sa�da + fun��o:
		JOptionPane.showMessageDialog(null, "A soma de 1 até num é: " + de1ParaN(num));
	}
	// c�digo: fun��o recursiva
	static int de1ParaN(int n) {
		// criar/ definir vari�veis:
		int total;
		// processamento de dados:
		// condi��o de sa�da:
		if(n == 1) {
			// retorna valor 01:
			return 1;
		// processamento de recursividade:
		} else {
			total = n + de1ParaN(n - 1);
			// retorna valor 02:
			return total;
		}
	}
}
