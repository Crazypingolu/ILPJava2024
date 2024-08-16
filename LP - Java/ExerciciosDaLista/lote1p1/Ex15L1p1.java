/* 
 * Programa: Receba os valores de 2 catetos de um triângulo retângulo. 
 * Calcule e mostre a hipotenusa
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex15L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        double c1, c2, c3;
        // Entrada de dados:
        System.err.println(" ");
        System.out.println("Digite o 1º cateto: ");
        c1 = leitor.nextDouble();
        System.out.println("Digite o 2º cateto: ");
        c2 = leitor.nextDouble();
        leitor.close();
        // Processamento de dados:
        c3 = Math.pow(c2, 2) + Math.pow(c1, 2);
        c3 = Math.sqrt(c3);
        // Saída de dados:
        System.out.println("hipotenusa: " + c3);
    }
}
