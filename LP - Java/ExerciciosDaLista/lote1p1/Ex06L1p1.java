/* 
 * Programa: Receba os valores em x e y. Efetua a troca de seus valores
 * e mostre seus conteúdos.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex06L1p1 {
    public static void main(String[] args) {
        // Declara variáveis:
        int x, y, aux;
        // entrada de dados:
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor: "));
        // processamento de dados:
        aux = x;
        x = y;
        y = aux;
        // saída de dados:
        JOptionPane.showMessageDialog(null, "Troca Efetuada.");
        System.out.println(x);
        System.out.println(y);
    }
}
