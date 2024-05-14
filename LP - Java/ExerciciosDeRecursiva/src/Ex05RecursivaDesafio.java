/*
 * Programa: calcular a sequencia: n! + (n-1)! + ... + (1)!; usando recursiva
 * Programador: LucasP, Crazypingolu
 * vers�o: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex05RecursivaDesafio {
	// c�digo principal:
	public static void main(String[] args) {
		// criar/definir vari�veis:
		int num;
		// entrada de dados:
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		// sa�da de dados:
		JOptionPane.showMessageDialog(null, "Soma de todos os fatoriais: " + somaFat(num));
	}
	static int somaFat(int n) {
		// criar/definir vari�vel:
		int total;
		// processamento de dados:
		if(n == 1) {
			return 1;
		} else {
			total = Fat(n) + somaFat(n-1);
			return total;
		}
	}
	static int Fat(int x) {
		// criar vari�vel:
		int fatTotal;
		// processamento:
		if(x == 1) {
			return 1;
		} else {
			fatTotal = x * Fat(x - 1);
			return fatTotal;
		}
	}
}
