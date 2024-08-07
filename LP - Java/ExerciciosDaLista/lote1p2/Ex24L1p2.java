/* 
 * Programa: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex24L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
        int num;
         // Entrada de dados:
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        // Saída de dados:
        multiplos(num);
    }
    static void multiplos(int n){
        System.out.println(" ");
        if(n % 2 == 0){
            System.out.println("Divisível por 2");
        }
        if(n % 3 == 0){
            System.out.println("Divisível por 3");
        }
    }
}
