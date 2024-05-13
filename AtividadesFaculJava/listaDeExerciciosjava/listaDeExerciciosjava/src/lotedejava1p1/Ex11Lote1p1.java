package lotedejava1p1;
/*
 *Programa: Calculo da circunferencia
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
// Trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex11Lote1p1 {
	public static void main(String args[]){
		// definir variáveis
		float r,c;
		// entrada de dados:
		r = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio: "));
		// Processamento de dados:
		c = (2*r)*(float)3.141592;
		// Saída de Dados:
		JOptionPane.showMessageDialog(null, "Circunferencia: "+c);
		
	}
}
