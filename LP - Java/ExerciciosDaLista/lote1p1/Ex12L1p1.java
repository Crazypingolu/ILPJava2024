/* 
 * Programa: Receba o ano de nascimento e o ano atual. 
 * Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex12L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis: 
        int anoN, anoA, idadeA, idadeF;
        Scanner leitor = new Scanner(System.in);
        // Entrada de dados:
        System.out.println(" ");
        System.out.println("Digite o ano de nascimento: ");
        anoN = leitor.nextInt();
        System.out.println("Digite o ano atual: ");
        anoA = leitor.nextInt();
        leitor.close();
        // Processamento de dados:
        idadeA = anoA - anoN;
        idadeF = idadeA + 17;
        // Saída de dados:
        System.out.println("idade atual: " + idadeA);
        System.out.println("idade daqui 17 anos: " + idadeF);
    }
}
