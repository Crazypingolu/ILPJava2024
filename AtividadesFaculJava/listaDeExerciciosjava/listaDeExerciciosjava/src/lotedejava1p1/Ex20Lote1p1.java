package lotedejava1p1;
import javax.swing.JOptionPane;
public class Ex20Lote1p1 {
	public static void main(String args[]) {
		// Definir variáveis:
		int va,vb,vc,del,x1,x2;
		// Entrada de dados:
		va = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'a': "));
		vb = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'b': "));
		vc = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'c': "));
		// Processamento de Dados:
		del = (int)Math.pow(vb, 2)-(4*(va*vc));
		// Decisão - Delta tem raiz:
		if(del == 0){
			x1 = (-1*vb)/(2*va);
			// Saída de dados:
			JOptionPane.showMessageDialog(null, "Raíz: \n"+ x1);
		} else if(del > 0){
			x1 = ((-1*vb)+(int)Math.sqrt(del))/(2*va);
			x2 = ((-1*vb)-(int)Math.sqrt(del))/(2*va);
			// Saída de dados:
			JOptionPane.showMessageDialog(null, "Raízes: \n"+ x1 + "\n" + x2);
		} else {
			JOptionPane.showMessageDialog(null, "Não tem Raíz (delta < 0)");
		}
	}
}