/* 
 * Programa: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não 
 * necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex23L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
        int[] valores = new int[4];
        // Entrada de dados:
        for(int cto = 0 ; cto < valores.length ; cto++){
            valores[cto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (cto + 1) + "º valor: "));
        }
        // Saída de dados:
        organiza(valores);
    }
    static void organiza(int[] val){
        int aux = 0;
        for(int i = 0 ; i < 3 ; i ++){
            if(val[3] < val[i] && aux == 0){
                System.out.println(val[3]);
                aux += 1;
            }
            System.out.println(val[i]);
            if(i == 2 && aux == 0){
                System.out.println(val[3]);
            }
        }
    }
} // Fim.
