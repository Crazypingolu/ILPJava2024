package lotedejava1p1;
/*
 *Programa: Receba o Salário e faça o reajuste de 15%
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
import javax.swing.JOptionPane;
public class Ex02Lote1p1 {
	public static void main(String args[]) {
	// Declarar variável:
	   float sal,reajuste;
	   sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do SALÁRIO: "));
	   reajuste = sal * (float) 1.15;
	   JOptionPane.showMessageDialog(null,"Reajuste: " + reajuste);
	}
}
