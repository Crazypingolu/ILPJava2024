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
    public int[][] classificaregistro(Votacao[] voto, int[][] registro){
        return registro;
    }
    // Gravar/Ler registro:
    public int[][] consultarRegistro(int[][] registro) throws IOException{
        String registroFisico = "Registro_Votacao.txt";
        BufferedWriter ler = new BufferedWriter(new FileWriter(registroFisico));
        
        return registro;
    }
}
