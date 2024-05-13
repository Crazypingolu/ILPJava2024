package lotedejava1p1;
/*
 *Programa: Calcular idade pelo ano atual e de nascimento e aumento de 17 anos
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
// Trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex12Lote1p1 {
	public static void main (String args[]){
		// Definir variáveis
		int an,at,pa,pf;
		// entrada de dados:
		an = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		at = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		// Processamento de dados:
		pa = at - an;
		pf = pa + 17;
		// Saída de Dados:
		JOptionPane.showMessageDialog(null, "Sua Idade: " + pa + "\nIdade pós 17 anos: " + pf);
	}
}
