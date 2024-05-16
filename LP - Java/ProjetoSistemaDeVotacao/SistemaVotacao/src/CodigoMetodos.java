import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class CodigoMetodos {
    public Votacao[] carregaSecao(Votacao[] voto){ // gerar a seção e o voto do candidato
        Random numAleatorio = new Random();
        for(int i = 0; i < voto.length; i++){
            voto[i].numeroSecao = numAleatorio.nextInt(11);
            voto[i].numeroCandidato = numAleatorio.nextInt(301);
        }
        JOptionPane.showMessageDialog(null,
        "Geração concluída.");
        return voto;
    }
    // Guardar os registro em uma matrix 2x200:
    public int[][] classificaregistro(Votacao[] votos, int[][] registro){
        for(int c = 0 ; c < votos.length ; c ++){
            registro[c][0] = votos[c].numeroSecao;
            registro[c][1] = votos[c].numeroCandidato;   
        }
        JOptionPane.showMessageDialog(null,
        "Classificação concluída.");
        return registro;
    }
    // Gravar/Ler registro:
    public void registro(Votacao[] voto, int[][] registro) throws IOException{
        // Variável de controle:
        int opc=0;
        // Entrada de valor:
        while(opc != 1 && opc != 2){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                "ESCOLHA " +
                "\n[1] - Gravar. " +
                "\n[2] - Ler. " ));
            switch (opc) {
                case 1:
                    registroGravar(registro);
                    break;
                case 2:
                    registroLer(voto, registro);
                    break;
                default:
                JOptionPane.showMessageDialog(null,
                    "opção inválida, tente novamente.");
                    break;
            }
        }
    }
    // Gravar o registro em .txt:
    static void registroGravar(int[][] reg) throws IOException{
        String registroFisico = "Registro_Votacao.txt";
        BufferedWriter escrever = new BufferedWriter(new FileWriter(registroFisico));
        for(int i = 0 ; i < reg.length ; i++){ // linha
            for(int j = 0 ; j < reg[0].length ; j++){ // coluna
                escrever.write(Integer.toString(reg[i][j])); // registra o valor (int) como str em uma linha do txt
                escrever.newLine(); // próxima linha
            }
        }
        escrever.close();
        JOptionPane.showMessageDialog(null, "Gravação concluída.");
    }
    // Ler o registro .txt:
    static void registroLer(Votacao[] voto, int[][] reg) throws IOException{
        String registroFisico = "Registro_Votacao.txt";
        BufferedReader ler = new BufferedReader(new FileReader(registroFisico));
        for(int i = 0 ; i < reg.length ; i++){ // linha
            for(int j = 0 ; j < reg[0].length ; j++){ // coluna
                if (i == 0 || j == 0){ // condicional pra gravar a 1º linha (não sei pq precisa mas só funcionou desse jeito)
                    voto[0].numeroSecao = reg[0][0];
                }
                reg[i][j] = (Integer.parseInt(ler.readLine()));
            }
            voto[i].numeroSecao = reg[i][0];
            voto[i].numeroCandidato = reg[i][1];
        }
        ler.close(); 
    }
}
