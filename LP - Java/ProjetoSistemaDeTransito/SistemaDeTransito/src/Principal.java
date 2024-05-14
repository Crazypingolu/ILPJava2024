import java.io.IOException;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) throws IOException { // throws *** é por conta do registro em txt, ----[NÃO ESQUECER]----
        // Estancia de classe em # registros de vetor:
        Estatistica[] cid = new Estatistica[10];
        // Estanciar os métodos (função/procedimentos):
        Metodos metodos = new Metodos();
        // Executar o construtor:
        for(int i = 0; i < cid.length; i++){
            cid[i] = new Estatistica();
        }
        int loopEntrada = 0;
        while (loopEntrada != 9) {
            loopEntrada = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU ESTATÍSTICA\n[1] - Cadastro de estatística no registro.\n[2] - Ler estatísticas do registro.\n[3] - Consulta por quantidade de acidente.\n[4] - Consulta por estatística de acidente.\n[5] - Acidentes acima da média.\n[9] - Finalizar programa."));
                switch (loopEntrada) {
                    case 1:
                        // Executa a função de registro 
                        metodos.adicionarRegistro(cid);
                        break;
                    case 2:
                        // Executar função leitura
                        metodos.lerRegistro(cid);
                        break;
                    case 3:
                        // Executa o procedimento para verificar a quantidade de acidentes entre 100 e 500
                        metodos.verificarIntervalo(cid);
                        break;
                    case 4:
                        // Executa o procedimento para verificar a quantidade de acidentes entre 100 e 500
                        metodos.maiorEMenor(cid);
                        break;
                    case 5:
                        // Executa o procedimento para mostrar quais cidades estão acicma da média de acidentes
                        metodos.maiorQueMedia(cid);
                        break;
                    case 9:
                        // saída
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção inválida");
                        break;
                }
        }
    }
}
