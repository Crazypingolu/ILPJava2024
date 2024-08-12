/* 
 * Programa: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex11L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        double raio, comp;
        // Entrada de dados:
        System.out.println(" ");
        System.out.println("\nDigite o valor do raio: ");
        raio = leitor.nextDouble();
        leitor.close();
        // Processamento de dados:
        comp = 2 * raio * 3.14;
        // Saída de dados:
        System.out.println("Valor do comprimento (aproximadamente): " + comp + "\n");
    }
}
