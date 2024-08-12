/* 
 * Programa: Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex10L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        double n1, n2, dif;
        // Entrada de dados:
        System.out.println(" "); // Mensagem anti-Bug de console
        System.out.println("Digite o 1º valor: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite o 2º valor: ");
        n2 = leitor.nextDouble();
        leitor.close();
        // Processamento de dados:
        if(n1 > n2){
            dif = n1 - n2;
        } else {
            dif = n2 - n1;
        }
        // Saída de dados:
        System.out.println("Diferença do maior pelo menor: " + dif + "\n");
    }
}
