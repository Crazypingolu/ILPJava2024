/* 
 * Programa: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias 
 * durará esse alimento sabendo que a pessoa consome 50g ao dia
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex13L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        int kg, dias;
        // Entrada de dados:
        System.err.println(" ");
        System.out.println("Digite a quantidade de Kg: ");
        kg = leitor.nextInt();
        leitor.close();
        // Processamento de dados:
        dias = (kg * 1000) / 50;
        // Saída de dados:
        System.out.println("quantidade de dias: " + dias);
    }
}
