package lotedejava1p1;
/*
 *Programa: quantos dias duram uma comida com consumo de 50g
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
// Trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex13Lote1p1 {
	public static void main (String args[]){
		// Definir var:
		float kg,total;
		// Entrada de dados:
		kg = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de comida (em Kg): "));
		// Processamento:
		total = (kg * 1000) / 50;
		// Saída:
		JOptionPane.showMessageDialog(null, "Total de dias: " + total);
	}
}
