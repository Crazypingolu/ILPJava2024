/*
 * Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses 
 * valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
 * Programador: LucasPOliveira
 * versão: 1.0 
*/
package lotedejava1p3;

//trazer biblioteca
import javax.swing.JOptionPane;

public class Ex03Lote1p3 {
    // criar variáveis globais:
    static int[] vet1 = new int[3], vet2 = new int[3], vet3 = new int[6];

    // programa principal:
    public static void main(String[] args) {
        // criar / definir vairáveis:
        int fim = 1;
        // loop de entrada:
        while (fim != 0) {
            fim = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha:\n1 - Coletar dados (vetor 1)\n2 - Coletar dados (vetor 2)\n3 - Concatenar vetores, mostrar todos os valores\n0 - Finalizar Programa"));
            switch (fim) {
                case 1:
                    carregaVet(vet1);
                    break;
                case 2:
                    carregaVet(vet2);
                    break;
                case 3:
                    concatenar(vet1, vet2);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERRO\n\nValor inválido.");
                    break;
            } // fim - switch case
        } // fim - loop entrada
    } // fim - código main

    // código da função carregaVet:
    static int[] carregaVet(int[] vetor) {
        // criar / definir variáveis:
        int cto;
        for (cto = 0; cto < 3; cto++) {
            vetor[cto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (cto + 1) + "º Valor:"));
        }
        return vetor;
    } // fim - código da função

    // código do procedure:
    static void concatenar(int[] x, int[] y) {
        // criar/definir variáveis:
        int ctoVet, ctoCasa;
        // processamento de dados
        for (ctoVet = 0; ctoVet < 2; ctoVet++) {
            for (ctoCasa = 0; ctoCasa < 3; ctoCasa++) {
                if (ctoVet == 1) {
                    vet3[ctoCasa + 3] = y[ctoCasa];
                } else if (ctoVet == 0) {
                    vet3[ctoCasa] = x[ctoCasa];
                }
            }
        }
        for (ctoCasa = 0; ctoCasa < 6; ctoCasa++) {
            System.out.println(vet3[ctoCasa]);
        }
    }
}
