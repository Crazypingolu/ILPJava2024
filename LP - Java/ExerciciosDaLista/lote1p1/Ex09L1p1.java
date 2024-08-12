/* 
 * Programa: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex09L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        int n1, n2;
        Double somaT;
        // Entrada de dados:
        System.out.println(" ");
        System.out.println("Digite o 1º número: ");
        n1 = leitor.nextInt();
        System.out.println("Digite o 2º número: ");
        n2 = leitor.nextInt();
        leitor.close();
        // Processamento de dados:
        somaT = Math.pow(n1, 2) + Math.pow(n2, 2);
        // Saída de dados:
        System.out.println("Soma dos quadrados: " + somaT);
    }
}