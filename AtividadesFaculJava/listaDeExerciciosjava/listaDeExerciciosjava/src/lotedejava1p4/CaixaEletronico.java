package lotedejava1p4;

//trazer biblioteca:
import javax.swing.JOptionPane;

public class CaixaEletronico {
    // criar/definir variáveis globais:
    // notas:
    static int notasNaMaquina[] = new int[6], faltaDeNotas = 0, valorTotalDoCaixa = 0;
    // quantidade de depósitos:
    static int loopDeposito;
    // tipo de banco:
    static int bancoDoBrasil = 0, santander = 0, itau = 0, caixa = 0;
    // estatisticas:
    static int maiorValor, menorValor, valorTotalDeSaque, mediaCtoSaque;
    static double mediaSaque;

    /*
     * Guia para memória:
     * 0 = 2R$
     * 1 = 5R$
     * 2 = 10R$
     * 3 = 20R$
     * 4 = 50R$
     * 5 = 100R$
     */
    // código - programa principal:
    public static void main(String args[]) {
        // criar/definir variáveis:
        int loopInicio = 0;
        // loop - entrada inicial:
        while (loopInicio != 9) {
            loopInicio = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal:\n[1] - Carregar notas\n[2] - Retirar notas\n[3] - Estatísticas\n[9] - Finalizar programa\nEscolha: "));
            switch (loopInicio) { // escolha caso - entrada
                case 1: // carregar notas
                    carregarNotas();
                    break;
                case 2: // retirar notas
                    if (loopDeposito < 100) {
                        retirarNotas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Máximo de depósitos alcançado.");
                    }
                    break;
                case 3:
                    Estatisticas();
                    break;
                case 9: // fim do programa
                    break;
                default: // qualquer número:
                    JOptionPane.showMessageDialog(null, "Número inválido.");
                    loopInicio = 1;
                    break;
            } // fim - escolha caso.
        } // fim - while.
    } // fim - código main

    // início - código carregarNotas:
    static void carregarNotas() {
        // entrada de dados (sem loop pra não encher de condicional.):
        notasNaMaquina[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de 2R$:"));
        valorTotalDoCaixa += (notasNaMaquina[0] * 2); // mutiplica o valor das notas de 2R$ e adiciona no valor total.
        notasNaMaquina[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de 5R$:"));
        valorTotalDoCaixa += (notasNaMaquina[1] * 5); // mutiplica o valor das notas de 5R$ e adiciona no valor total.
        notasNaMaquina[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de 10R$:"));
        valorTotalDoCaixa += (notasNaMaquina[2] * 10); // mutiplica o valor das notas de 10R$ e adiciona no valor total.
        notasNaMaquina[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de 20R$:"));
        valorTotalDoCaixa += (notasNaMaquina[3] * 20); // mutiplica o valor das notas de 20R$ e adiciona no valor total.
        notasNaMaquina[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de 50R$:"));
        valorTotalDoCaixa += (notasNaMaquina[4] * 50); // mutiplica o valor das notas de 50R$ e adiciona no valor total.
        notasNaMaquina[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de 100R$:"));
        valorTotalDoCaixa += (notasNaMaquina[5] * 100); // mutiplica o valor das notas de 100R$ e adiciona no total.
    } // fim - código procedure carregaNotas.

    // início - código retirarNotas:
    static void retirarNotas() {
        // criar/definir variáveis:
        // saque:
        int ctoSaque, saquet = 0, valorSaque = 0, saqueIni = 0, saqueEntrada = 0, saqueEntradaCto = 0;
        // tipo de saque:
        int automa = 0, ctoErro = 1;
        // notas:
        int notasDe100 = 0, notasDe50 = 0, notasDe20 = 0, notasDe10 = 0, notasDe5 = 0, notasDe2 = 0;
        int restoDe100 = 0, restoDe50 = 0, restoDe20 = 0, restoDe10 = 0, restoDe5 = 0, restoDe2 = 0;

        // entrada de dados:
        while (saquet == 0) {
            while (saqueEntradaCto == 0) {
                saqueEntrada = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha a opção para adicionar valor ao saque:\n[1] - R$100\n[2] - R$50\n[3] - R$20\n[4] - R$10\n[5] - R$5\n[6] - R$2\nTotal: "
                                + saqueEntrada));
                switch (saqueEntrada) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            }

            valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saque: "));
            saqueIni = valorSaque; // salva o valor inicial de saque
            if ((valorSaque - 3) % 10 == 0 || (valorSaque - 1) % 10 == 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido, insira novamente. ");
            } else {
                saquet = 1;
            }
        }
        if (valorSaque > valorTotalDoCaixa) {
            JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA. ");
        } else {
            while (automa == 0) {
                if (ctoErro == 4) {
                    JOptionPane.showMessageDialog(null, "Muitas tentativas inválidas, distribuição será automática. ");
                    automa = 1;
                } else {
                    automa = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha:\n[1] - Distribuição Automática.\n[2] - Distribuição Manual.\n\nTentativa: "
                                    + ctoErro
                                    + "/3"));
                }
                if (automa == 1) {
                    // loop de saque em ordem decrescente
                    for (ctoSaque = 5; ctoSaque > -1; ctoSaque--) {
                        // switch para o tipo de nota:
                        switch (ctoSaque) {
                            case 5: // notas de 100
                                if (notasNaMaquina[ctoSaque] > 0) { // verifica se ainda existem notas de 100
                                    if ((valorSaque % 100) >= 0) { // verifica se o valor é divisivel
                                        notasDe100 = valorSaque / 100; // armazena a quantidade de notas de 100
                                                                       // necessárias
                                        notasNaMaquina[ctoSaque] = notasNaMaquina[ctoSaque] - notasDe100; // retira
                                                                                                          // das
                                                                                                          // notas
                                        if (notasNaMaquina[ctoSaque] < 0) {
                                            restoDe100 = notasNaMaquina[ctoSaque] * -1;
                                            notasNaMaquina[ctoSaque] = 0;
                                        } // fim - se, notas negativas no vetor de notas + adiciona o valor faltante
                                    } // fim - se, o número é divisivel por 100
                                } // fim - se, não existem notas de 100 no vetor
                                valorSaque -= (notasDe100 * 100);
                                valorSaque += (restoDe100 * 100);
                                break;
                            case 4: // notas de 50
                                if (notasNaMaquina[ctoSaque] > 0) { // verifica se ainda existem notas de 50
                                    if ((valorSaque % 50) >= 0) { // verifica se o valor é divisivel
                                        notasDe50 = valorSaque / 50; // armazena a quantidade de notas de 50
                                                                     // necessárias
                                        notasNaMaquina[ctoSaque] = notasNaMaquina[ctoSaque] - notasDe50; // retira
                                                                                                         // das
                                                                                                         // notas
                                        if (notasNaMaquina[ctoSaque] < 0) {
                                            restoDe50 = notasNaMaquina[ctoSaque] * -1;
                                            notasNaMaquina[ctoSaque] = 0;
                                        } // fim - se, notas negativas no vetor de notas + adiciona o valor faltante
                                    } // fim - se, o número é divisivel por 50
                                } // fim - se, não existem notas de 50 no vetor
                                valorSaque -= (notasDe50 * 50);
                                valorSaque += (restoDe50 * 50);
                                break;
                            case 3: // notas de 20
                                if (notasNaMaquina[ctoSaque] > 0) { // verifica se ainda existem notas de 20
                                    if ((valorSaque % 20) >= 0) { // verifica se o valor é divisivel
                                        notasDe20 = valorSaque / 20; // armazena a quantidade de notas de 20
                                                                     // necessárias
                                        notasNaMaquina[ctoSaque] = notasNaMaquina[ctoSaque] - notasDe20; // retira
                                                                                                         // das
                                                                                                         // notas
                                        if (notasNaMaquina[ctoSaque] < 0) {
                                            restoDe20 = notasNaMaquina[ctoSaque] * -1;
                                            notasNaMaquina[ctoSaque] = 0;
                                        } // fim - se, notas negativas no vetor de notas + adiciona o valor faltante
                                    } // fim - se, o número é divisivel por 20
                                } // fim - se, não existem notas de 20 no vetor
                                valorSaque -= (notasDe20 * 20);
                                valorSaque += (restoDe20 * 20);
                                break;
                            case 2: // notas de 10
                                if (notasNaMaquina[ctoSaque] > 0) { // verifica se ainda existem notas de 10
                                    if ((valorSaque % 10) >= 0) { // verifica se o valor é divisivel
                                        notasDe10 = valorSaque / 10; // armazena a quantidade de notas de 10
                                                                     // necessárias
                                        notasNaMaquina[ctoSaque] = notasNaMaquina[ctoSaque] - notasDe10; // retira
                                                                                                         // das
                                                                                                         // notas
                                        if (notasNaMaquina[ctoSaque] < 0) {
                                            restoDe10 = notasNaMaquina[ctoSaque] * -1;
                                            notasNaMaquina[ctoSaque] = 0;
                                        } // fim - se, notas negativas no vetor de notas + adiciona o valor faltante
                                    } // fim - se, o número é divisivel por 10
                                } // fim - se, não existem notas de 10 no vetor
                                valorSaque -= (notasDe10 * 10);
                                valorSaque += (restoDe10 * 10);
                                break;
                            case 1: // notas de 5
                                if (notasNaMaquina[ctoSaque] > 0) { // verifica se ainda existem notas de 5
                                    if ((valorSaque % 5) >= 0 && (valorSaque % 5) != 1) { // verifica se o valor é
                                                                                          // divisivel
                                        notasDe5 = valorSaque / 5; // armazena a quantidade de notas de 5
                                                                   // necessárias
                                        notasNaMaquina[ctoSaque] = notasNaMaquina[ctoSaque] - notasDe5; // retira
                                                                                                        // das
                                                                                                        // notas
                                        if (notasNaMaquina[ctoSaque] < 0) {
                                            restoDe5 = notasNaMaquina[ctoSaque] * -1;
                                            notasNaMaquina[ctoSaque] = 0;
                                        } // fim - se, notas negativas no vetor de notas + adiciona o valor faltante
                                    } // fim - se, o número é divisivel por 5
                                } // fim - se, não existem notas de 5 no vetor
                                valorSaque -= (notasDe5 * 5);
                                valorSaque += (restoDe5 * 5);
                                break;
                            case 0: // notas de 2
                                if (notasNaMaquina[ctoSaque] > 0) { // verifica se ainda existem notas de 2
                                    if ((valorSaque % 2) >= 0) { // verifica se o valor é divisivel por 2
                                        notasDe2 = valorSaque / 2; // armazena a quantidade de notas de 2
                                                                   // necessárias
                                        notasNaMaquina[ctoSaque] = notasNaMaquina[ctoSaque] - notasDe2; // retira
                                                                                                        // das
                                                                                                        // notas
                                        if (notasNaMaquina[ctoSaque] < 0) {
                                            restoDe2 = notasNaMaquina[ctoSaque] * -1;
                                            notasNaMaquina[ctoSaque] = 0;
                                        } // fim - se, notas negativas no vetor de notas + adiciona o valor faltante
                                    } // fim - se, o número é divisivel por 2
                                } // fim - se, não existem notas de 2 no vetor
                                valorSaque -= (notasDe2 * 2);
                                valorSaque += (restoDe2 * 2);
                                break;
                        }
                        valorTotalDoCaixa -= saqueIni; // tira o saque do valor contabilizado no caixa
                        valorTotalDeSaque += saqueIni; // aumenta o total de saques naquele programa
                    }
                    JOptionPane.showMessageDialog(null,
                            "Notas de 100R$: " + notasDe100 + "\nNotas de 50R$: " + notasDe50 + "\nNotas de 20R$: "
                                    + notasDe20
                                    + "\nNotas de 10R$: " + notasDe10 + "\nNotas de 5R$: " + notasDe5
                                    + "\nNotas de 2R$: "
                                    + notasDe2); // saída da distribuição de notas
                    loopDeposito += 1;
                } else if (automa == 2) {

                } else if (automa != 2 && automa != 1) {
                    ctoErro += 1;
                    if (ctoErro != 4) {
                        JOptionPane.showMessageDialog(null, "opção errada, insira novamente. ");
                    }
                    automa = 0;
                }
            }

        }
    }

    static void Estatisticas() {
    }

}