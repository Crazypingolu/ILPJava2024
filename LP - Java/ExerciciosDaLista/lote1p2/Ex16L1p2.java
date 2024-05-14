/* 
 * Programa: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de 
 * desconto e o número de descendentes. Calcule o salário que serão as horas 
 * trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto –
 * desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. 
 * Exiba o salário a receber.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex16L1p2 {
    // Variaveis globais:
    static int horasTrabalhadas, desconto, dependentes;
    static float valorHora, salarioLiq, salarioBru;
    public static void main(String[] args) {
        // entrada:
        EntradaDeDados();
        // processamento:
        CalculoDeSalario();
        // saída:
        System.out.println("\nHoras Trabalhadas: "+ horasTrabalhadas + "Valor por hora: " + valorHora);
        System.out.println("Descontos: " + desconto + "% Dependentes: " + dependentes);
        JOptionPane.showMessageDialog(null, "Salário Bruto: " + salarioBru + "\nSalário liquído: " + salarioLiq);
    }

    static void EntradaDeDados(){
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora: ")); 
        desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite a % de desconto: "));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));       
    }

    static void CalculoDeSalario(){
        // cálculo de salário bruto:
        salarioBru = valorHora * horasTrabalhadas;
        // cálculo do salário líquido:
        salarioLiq = (salarioBru - ((salarioBru*desconto)/100)) + (dependentes * 100);
    }
}
