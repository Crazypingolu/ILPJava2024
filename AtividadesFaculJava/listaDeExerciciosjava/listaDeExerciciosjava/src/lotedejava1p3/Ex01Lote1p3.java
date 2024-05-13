/*
 * Programa: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 * a. A média dos valores entre 10 e 200;
 * b. A soma dos números ímpares.
 * Programador: LucasPOliveira
 * versão: 1.0 
*/
package lotedejava1p3;

import javax.swing.JOptionPane;

public class Ex01Lote1p3 {
    // variáveis globais:
    static int[] vetor = new int[50];

    // início - programa principal:
    public static void main(String[] args) {
        // criar/definir variáveis:
        int fim = 1, erroEntrada = 1, contador;
        // criar loop de entrada:
        while (fim != 0) {
            fim = Integer.parseInt(JOptionPane
                    .showInputDialog(
                            "Escolha: \n1 - Carregar vetor\n2 - Média de valores (entre 10 e 200)\n3 - Soma dos ímpares\n4 - Mostrar no console os valores do vetor\n0 - fim"));
            switch (fim) {
                case 1: // entrada de 50 números:
                    carregaVet(vetor);
                    break;
                case 2: // calcular média definida:
                    JOptionPane.showMessageDialog(null, "Média dos valores entre 10 e 200: " + mediaVet(vetor));
                    break;
                case 3: // soma ímpar:
                    JOptionPane.showMessageDialog(null, "Soma de todos os números ímpares: " + somaImparVet(vetor));
                    break;
                case 4: // mostrar no console os valores do vetor:
                    for (contador = 0; contador < 50; contador++) {
                        System.out.println(vetor[contador]);
                    } // fim - for.
                    break;
                case 0: // fecha o programa:
                    break;
                default: // qualquer número:
                    // condição de término, muitas tentativas:
                    if (erroEntrada == 3) {
                        JOptionPane.showMessageDialog(null, "Muitas tentativas inválidas, terminando programa.");
                        fim = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
                        erroEntrada += 1;
                    } // Fim - se (saída por erro)
                    break;
            } // Fim - escolha caso (tipo de operação)
        } // Fim - While (loop de entrada)
    } // Fim - código main

    // Início - código, função carregaVet:
    static int[] carregaVet(int[] vet) {
        // criar / definir variáveis:
        int cto, auto = 0;
        double numeroAleatorio;
        // entrada de dados no vetor:
        while (auto == 0) {
            auto = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n1 - Automático\n2 - Manual"));
            if (auto == 2) {
                for (cto = 0; cto < 50; cto++) {
                    vet[cto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + cto + "º valor:"));
                } // fim - for
            } else if (auto == 1) {
                for (cto = 0; cto < 50; cto++) {
                    numeroAleatorio = Math.random() * 501; // gera um número aleatóio todo loop
                    vet[cto] = (int) numeroAleatorio;
                } // fim - for
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
            } // fim -se
        } // fim - while
          // saída
        return vet;
    } // fim - código, função carregaVet.

    // Início - código, função mediaVet:
    static float mediaVet(int[] vet) {
        // criar / definir variável:
        int cto, div = 0;
        float media = 0;
        // processamento de dados:
        for (cto = 0; cto < 50; cto++) {
            if (vet[cto] > 10 && vet[cto] < 200) {
                media += vet[cto];
                div += 1;
            } // fim -se
        } // fim - for
        media = media / div;
        // saída:
        return media;
    } // Fim - código, função mediaVet

    // Início
    static int somaImparVet(int[] vet) {
        // criar / definir variável:
        int total = 0, cto;
        // processamento
        for (cto = 0; cto < 50; cto++) {
            if (vet[cto] % 2 != 0) {
                total += vet[cto];
            } // fim -se
        } // fim - for
        return total;
    } // Fim - código, função somaImparvet.
}