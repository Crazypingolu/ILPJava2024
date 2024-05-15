/*
 * Programa: calcular a sequência: 1/1 + 1/2 + ... + 1/n ; usando recursiva
 * Programador:  LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex03Recursiva {
	// código principal:
	public static void main(String[] args) {
		// criar/deifinir variáveis:
		float num;
		// entrada de dados:
		num = Float.parseFloat(JOptionPane.showInputDialog("Digite num: "));
		// saída de dados:
		JOptionPane.showMessageDialog(null, "A soma da sequência 1/1 + 1/2 + ... + 1/n é: " + umSobreN(num));
	}
	// código da função recursiva:
	static float umSobreN(float n) {
		// definir variáveis:
		float total;
		// processamento de dados:
		// condição de saída:
		if (n == 1) {
			return 1;
		} else {
			total = 1/n + umSobreN(n-1);
			return total;
		}
	}
}
