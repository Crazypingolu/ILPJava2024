/* 
 * Programa: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex14L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        int a1, a2, a3;
        // Entrada de dados:
        System.err.println(" ");
        System.out.println("Digite o 1º ângulo: ");
        a1 = leitor.nextInt();
        System.out.println("Digite o 2º ângulo: ");
        a2 = leitor.nextInt();
        leitor.close();
        // Processamento de dados:
        a3 = 180 - a1 - a2;
        // Saída de dados:
        System.out.println("3º angulo: " + a3);
    }
}
