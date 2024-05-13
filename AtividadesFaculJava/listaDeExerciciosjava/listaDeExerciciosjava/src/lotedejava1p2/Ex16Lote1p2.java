/*
 *Programa: Calcule o salário e seus reajustes.
 *salário bruto = valor por hora * quantidade de horas trabalhadas
 *salário líquido = salário bruto - descontos + 100 por dependente
 *Programador: LucasPOliveira
 *versão: 2.0 
*/
package lotedejava1p2;
import javax.swing.JOptionPane;
public class Ex16Lote1p2 {
    // variáveis globais:
    static float salBruto, salLiquido;
    // principal:
    public static void main(String[] args){
        // criar variáveis:
        float hTrabalhadas, valorPHora;
        // entrada de dados:
        hTrabalhadas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valorPHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora: "));
        // processamento de dados:
        salBruto = hTrabalhadas * valorPHora;
        alteracoes(); // chama a função
        // Saída de dados:
        JOptionPane.showMessageDialog(null,"Salário líquido: " + salLiquido);
    }
    // função
    static void alteracoes(){
        // criar variáveis:
        float descontos, acrescimoDeDependentes;
        // entrada de dados:
        descontos = Float.parseFloat(JOptionPane.showInputDialog("Digite a % de descontos: "));
        acrescimoDeDependentes = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de dependentes: "));
        // processamento de dados:
        salLiquido = (salBruto - (salBruto * (descontos / 100)))+(acrescimoDeDependentes * 100);
    }
}
