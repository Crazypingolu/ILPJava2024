/* 
 * Programa: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex26L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
         int val1, val2;
        // Entrada de dados:
         val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor: "));
         val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor: "));
        // Processamento + saída de dados:
        if(val1 > val2) {
             vef_multiplo(val1, val2);
        } else {
             vef_multiplo(val2, val1);
        }
    }

    static void vef_multiplo(int n1, int n2){
        System.out.println(" ");
        if(n1 % n2 == 0){
             System.out.println("O maior é multiplo do menor.");
        } else {
             System.out.println("O maior não é multiplo do menor.");
        }
    }
}
