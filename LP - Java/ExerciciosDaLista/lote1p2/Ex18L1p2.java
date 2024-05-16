/* 
 * Programa: Receba 2 valores inteiros. Calcule e mostre
 * o resultado da diferença do maior pelo menos valor. 
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/

import javax.swing.JOptionPane;

public class Ex18L1p2 {
    // Código principal:
    public static void main(String[] args) {
        // Declarar variáveis:
        int num1, num2;
        // Entrada de dados:
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º número (Inteiro): "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º número (Inteiro): "));
        // Saída com função:
        JOptionPane.showMessageDialog(null, "A Diferença do maior pelo menor é: " + maiorMenor(num1,num2));
    }
    // Função maiorMenor:
    static int maiorMenor(int x,int y){
        // Declarar variáveis locais:
        int total = 0;
        // Processamento:
        if(x > y){ // x sendo o número de maior valor:
            total = (x - y);
        } else { // y sendo o maior valor e se ambos tiverem o mesmo valor:
            total = (y - x);
        }
        return total;
    }
}
