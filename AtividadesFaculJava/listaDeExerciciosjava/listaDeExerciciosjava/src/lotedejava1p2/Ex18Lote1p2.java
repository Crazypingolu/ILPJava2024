/* 
 * Programa: Receber 2 valores inteiros e ver a diferença do maior pelo menor
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;
import javax.swing.JOptionPane;
public class Ex18Lote1p2 {
    // principal:
    public static void main(String[] args){
        // declarar variável:
        int num1, num2;
        // entrada de dados:
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        // processamento:
        if(num1 > num2){
            JOptionPane.showMessageDialog(null,"A diferença do maior para o menor é de: " + dif(num1,num2));
        } else{
            JOptionPane.showMessageDialog(null,"A diferença do maior para o menor é de: " + dif(num2,num1));
        }
    }
    static int dif(int x1, int x2){
        // declarar variável:
        int total;
        total = x1 - x2;
        return total;
    }
}