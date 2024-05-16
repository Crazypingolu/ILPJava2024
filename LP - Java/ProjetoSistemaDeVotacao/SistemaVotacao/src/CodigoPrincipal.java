import java.io.IOException;
import javax.swing.JOptionPane;
public class CodigoPrincipal {
    public static void main(String[] args) throws IOException{
        // Matriz:
        int[][] registroVotacao = new int[20][2];
        // Instancia de Classe:
        Votacao[] voto = new Votacao[200]; // Classe Votação
        MetodosMenu01 metodoMenu = new MetodosMenu01(); // Metodos 01 - gerar, armazenar, gravar e ler
        // Executar o constutor:
        for (int c = 0; c < voto.length; c++ ) {
            voto[c] = new Votacao();            
        }
        // derfinir variáveis:
        int loopMenuVotacao = 0;
        // Loop 1º menu:
        while(loopMenuVotacao != 9){
            loopMenuVotacao = Integer.parseInt(JOptionPane.showInputDialog(
                "SISTEMA DE VOTAÇÃO." +
                "\n[1] - Carregar Seção/Número do Eleitor."+
                "\n[2] - Classificar por Seção." +
                "\n[3] - Gravar/Ler Registros." +
                "\n[4] - Mostrar Indicadores." +
                "\n[9] - Finalizar Programa."));
            switch (loopMenuVotacao) {
                case 1: // Carregar votos e número da seção
                    metodoMenu.carregaSecao(voto);
                    break;
                case 2: // Guardar os registros em 1 matriz:
                    metodoMenu.classificaregistro(voto, registroVotacao);
                    break;
                case 3: // Gravar/Ler dados
                    metodoMenu.registro(voto, registroVotacao);
                    break;
                case 4:
                    // Mostrar menu estatísticas:
                    menuIndicadores(voto);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando Programa.");
                    break;
                default:
                    // mostrar mensagem inválida:
                    JOptionPane.showMessageDialog(null,"Opção Inválida.");
                    break;
            }
        }
    }
    static void menuIndicadores(Votacao[] voto){
        // instancia de classe metodo estatística:
        MetodosEstatisticas metodoEst = new MetodosEstatisticas(); // Metodos 02
        // definir variáveis:
        int loopMenuIndicadores = 0;
        // loop 2º menu (indicadores):
        while (loopMenuIndicadores != 9) {
            loopMenuIndicadores = Integer.parseInt(JOptionPane.showInputDialog(
                "INDICADORES. \nEstatísticas de Votação em 2024" +
                "\n[1] - Quantidade eleitores por seção."+
                "\n[2] - Seção com maior e menor números de eleitores." +
                "\n[3] - Quantidade de votos por candidato." +
                "\n[4] - 10 primeiros colocados (nº do candidato e sua quantidade de votos)." +
                "\n[9] - Voltar ao menu principal."));
            switch (loopMenuIndicadores) {
                case 1:
                    metodoEst.eleitorPSecao(voto);
                    break;
                case 2:
                    metodoEst.maiorMenorEleitores(voto);
                    break;
                case 3:
                    metodoEst.votoCandidato(voto);
                    break;
                case 4:
                    metodoEst.top10(voto);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(
                        null,"Opção Inválida.");
                    break;
            }
        }
    }
}