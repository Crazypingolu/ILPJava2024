/* 
 * Programa: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex22L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
        int num1, num2;
        // Entrada de dados:
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
        // Processamento + saída de dados:
        ordenar(num1, num2);
        // Fim.
    }
    static void ordenar(int n1, int n2){
        if(n1 > n2){
            JOptionPane.showMessageDialog(null, n1 + "\n" + n2);
        } else {
            JOptionPane.showMessageDialog(null, n2 + "\n" + n1);
        }
    }
}
