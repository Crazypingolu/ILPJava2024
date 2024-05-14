/*
 * Programa: calcular a sequencia: n/1 + (n-1)/2 + ... + (1/n); usando recursiva
 * Programador:  LucasP, Crazypingolu
 * versão: 2.0
*/
//trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex04Recursiva {
	// código principal:
	public static void main(String[] args) {
		// criar/definir vari�veis:
		float num1, num2 = 1;
		// entrada de dados:
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� valor: "));
		// saida de dados:
		JOptionPane.showMessageDialog(null, "Total: " + F4(num1, num2));
	}
	// c�digo da recursiva:
	static float F4(float n1, float n2) {
		// criar/definir vari�vel:
		float total;
		// processamento de dados:
		if(n1 == 1) {
			return n1/n2;
		} else {
			total = n1/n2 + F4(n1 - 1,n2 + 1);
			return total;
		}
		
	}
}
