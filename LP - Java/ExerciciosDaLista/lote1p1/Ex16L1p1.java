/* 
 * Programa:Receba a quantidade de horas trabalhadas, o valor por hora, 
 * o percentual de desconto e o número de descendentes. 
 * Calcule o salário que serão as horas trabalhadas x o valor por hora. 
 * Calcule o salário líquido (= Salário Bruto – desconto). 
 * A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import java.util.Scanner;
public class Ex16L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        Scanner leitor = new Scanner(System.in);
        double qntH, valorH, desc, salL, salB, dep;
        // Entrada de dados:
        System.err.println(" ");
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        qntH = leitor.nextDouble();
        System.out.println("Digite o valor de horas: ");
        valorH = leitor.nextDouble();
        System.out.println("Digite a % de descontos: ");
        desc = leitor.nextDouble();
        System.out.println("Digite a quantidade de dependentes: ");
        dep = leitor.nextDouble();
        leitor.close();
        // Processamento de dados:
        salB = qntH * valorH;
        salL = salB - (salB * desc) + (dep * 100);
        // Saída de dados:
        System.out.println("Salário Bruto: " + salB);
        System.out.println("Salário Líquido: " + salL);
    }
}
