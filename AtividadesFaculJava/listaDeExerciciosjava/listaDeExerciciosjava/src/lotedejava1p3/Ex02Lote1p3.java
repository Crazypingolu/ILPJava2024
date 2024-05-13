/*
 * Programa: Criar e coletar um vetor [100] inteiro e exibir:
 * a. O maior e o menor valor;
 * b. A média dos valores.
 * Programador: LucasPOliveira
 * versão: 1.0 
*/
package lotedejava1p3;

// trazer biblioteca:
import javax.swing.JOptionPane;

public class Ex02Lote1p3 {
    // criar / definir variável global:
    static int[] vetor = new int[100];

    // Início - código principal:
    public static void main(String[] args) {
        // criar / definir variáveis locais:
        int fim = 1, erroEntrada = 1;
        // entrada de dados, loop:
        while (fim != 0) {
            fim = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha: \n1 - Carregar vetor.\n2 - Mostrar maior e menor valor.\n3 - média\n0 - Finalizar programa."));
            switch (fim) {
                case 0: // fim do programa
                    break;
                case 1: // carregar o vetor:
                    carregarVetor(vetor);
                    break;
                case 2: // maior e menor valor no vetor:
                    maiorEMenorValor(vetor);
                    break;
                case 3: // calcular a média dos valores do vetor:
                    JOptionPane.showMessageDialog(null, "Média dos valores do vetor: " + mediaVet(vetor));
                    break;
                default: // qualquer número:
                    if (erroEntrada == 3) { // condição de término, muitas tentativas:
                        JOptionPane.showMessageDialog(null, "Muitas tentativas inválidas, terminando programa.");
                        fim = 0;
                    } else { // contador de erros
                        JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
                        erroEntrada += 1;
                    } // Fim - if, saída por erro
                    break;
            } // fim - escolha caso, entrada
        } // fim - while, entrada
    } // fim - código main

    // Início - código da função carregarVetor()
    static int[] carregarVetor(int[] vet) {
        // definir / criar variáveis:
        int cto, vetAuto = 0;
        double numRandom;
        // entrada de dados, loop 1 (automatico sim/nao):
        while (vetAuto == 0) {
            vetAuto = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n1 - Automático.\n2 - Manual."));
            if (vetAuto == 1) { // colocar números automáticamente:
                for (cto = 0; cto < 100; cto++) {
                    // gerar número aleatório:
                    numRandom = Math.random() * 501;
                    // coloca no vetor:
                    vet[cto] = (int) numRandom;
                } // fim - for númeor aleatório no vetor
            } else if (vetAuto == 2) { // entrada manual:
                for (cto = 1; cto < 50; cto++) {
                    vet[cto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (cto + 1) + "º número: "));
                } // fim - for entrada manual n o vetor
            } else { // mensagem de entrada errada:
                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente.");
                vetAuto = 0;
            } // fim - if carrega vetor
        } // fim - while carrega vetor
          // saída:
        return vet;
    } // fim função carregarVetor()

    // Início - código procedure maiorEMenorValor()
    static void maiorEMenorValor(int[] vet) {
        // criar / definir variáveis:
        int maior = 0, menor = 0, cto;
        // processamento, loop
        for (cto = 0; cto < 100; cto++) { // loop de análise
            if (cto == 0) { // 1º valor vira o menor.
                menor = vet[cto];
            } else {
                if (vet[cto] > maior) { // valor no vetor maior que o maior atual maior
                    maior = vet[cto];
                } // fim - se, maior valor
                if (vet[cto] < menor) { // valor no vetor menor que o atual menor
                    menor = vet[cto];
                } // fim - se, menor valor
            } // fim - se 1ª entrada.
        } // fim - loop de análise
          // Saída de dados:
        JOptionPane.showMessageDialog(null, "Maior valor: " + maior + "\nMenor valor: " + menor);
    } // Fim - código da função maiorEMernorvalor.

    // Início - código função mediaVet()
    static float mediaVet(int[] vet) {
        // criar/ definir variáveis:
        float total = 0;
        int cto;
        // processamento:
        for (cto = 0; cto < 100; cto++) {
            total += vet[cto];
        } // fim loop de soma
        total = total / 100;
        // saída:
        return total;
    } // fim - código função mediaVet
}