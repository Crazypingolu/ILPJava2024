import javax.swing.JOptionPane;
import java.io.*;
public class Metodos {
    /* Criar um registro (sem salvar):
    public Estatistica[] adicionarRegistro(Estatistica[] cidade){
        // criar um registro baseado na classe Estatisticas.
        for(int i = 0; i < cidade.length;i++){
            cidade[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da " + (i+1) + "º cidade: "));
            cidade[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "º cidade: ");
            cidade[i].quantidadeAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da " + (i+1) + "º cidade: "));
        }
        return cidade;
    }*/
    // criar registro (salvando em txt):
    public Estatistica[] adicionarRegistro(Estatistica[] cidade) throws IOException{
        String file = "REGISTROTRANSITO.txt"; // Escolhe o arquivo txt para gravação
        BufferedWriter escrever = new BufferedWriter(new FileWriter(file)); // cria o "escrevedor"
        for(int i = 0; i < cidade.length;i++){ // Loop de entrada
            // código da cidade:
            cidade[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da " + (i+1) + "º cidade: "));
            escrever.write(Integer.toString(cidade[i].codigoCidade)); // registra o valor (int) como str em uma linha do txt
            escrever.newLine(); // próxima linha
            // Nome da cidade: 
            cidade[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "º cidade: ");
            escrever.write(cidade[i].nomeCidade); // registra o valor (sem conversão)
            escrever.newLine();
            // Quantidade de Acidentes;
            cidade[i].quantidadeAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da " + (i+1) + "º cidade: "));
            escrever.write(Integer.toString(cidade[i].quantidadeAcidentes));
            escrever.newLine();
        }
        escrever.close(); // termina a escrita, ----[NÃO ESQUECER]----
        JOptionPane.showMessageDialog(null, "Gravação concluída.");
        return cidade;
    }
    // ler registro (Importante!)
    public void lerRegistro(Estatistica[] cidade) throws IOException{
        String file = "REGISTROTRANSITO.txt"; // Escolhe o arquivo para leitura
        BufferedReader ler = new BufferedReader(new FileReader(file)); // cria  "leitor"
        for(int i = 0; i < cidade.length;i++){
            cidade[i] = new Estatistica();  // cria o construtor para leitura;
        }
        for(int i = 0; i < cidade.length;i++){
            cidade[i].codigoCidade = Integer.parseInt(ler.readLine()); // ler str e converter (int)
            cidade[i].nomeCidade = ler.readLine();
            cidade[i].quantidadeAcidentes = Integer.parseInt(ler.readLine());
        }
        ler.close();
        JOptionPane.showMessageDialog(null, "Leitura concluída.");
        return;
    }
    // verificar cidades entrew 100 e 500 acidentes:
    public void verificarIntervalo(Estatistica[] cidade){
        int cidcont = 0; // contador de cidades que aparecem no intervalo.
        System.out.println("Cidades entre 100 e 500 acidentes: ");
        for(int c = 0; c < cidade.length; c++){
            if(cidade[c].quantidadeAcidentes > 100 && cidade[c].quantidadeAcidentes < 500){
                // mostra nome e código da cidade no intervalo
                System.out.println("\nNome: "+ cidade[c].nomeCidade + "\nCódigo: " + cidade[c].codigoCidade);
                cidcont += 1;
            }
        }
        if(cidcont == 0){ // caso nenhuma cidade apareça:
            System.out.println("Nenhuma cidade está entre 100 e 500 acidentes.");
        }
        System.out.println("...");
        // Mensagem de saída
        JOptionPane.showMessageDialog(null, "Verificação concluída.");
    }
    // verific
    public void maiorEMenor(Estatistica[] cidade){
        // definir variáveis:
        int maior = -1, menor = -1;
        int maiorci = -1, menorci = -1;
        for(int cto = 0; cto < cidade.length; cto++){
            if(maior == -1){ // se for a primeira entrada:
                maior = cidade[cto].quantidadeAcidentes;
                maiorci = cto;
                menor = cidade[cto].quantidadeAcidentes;
                menorci = cto;
            } else { // proximas entradas
                if(cidade[cto].quantidadeAcidentes > maior){
                    maior = cidade[cto].quantidadeAcidentes;
                    maiorci = cto;
                }
                if(cidade[cto].quantidadeAcidentes < menor){
                    menor = cidade[cto].quantidadeAcidentes;
                    menorci = cto;
                }
            }
        }
        System.out.println("\nCidade com a maior quantidade de acidentes: " + cidade[maiorci].nomeCidade);
        System.out.println("Quantidade de acidentes: " + cidade[maiorci].quantidadeAcidentes);
        System.out.println("\nCidade com a menor quantidade de acidentes: " + cidade[menorci].nomeCidade);
        System.out.println("Quantidade de acidentes: " + cidade[menorci].quantidadeAcidentes);
        // Mensagem de saída
        JOptionPane.showMessageDialog(null, "Verificação concluída.");
    }

    public void maiorQueMedia(Estatistica[] cidade){
        // definir variáveis:
        int mediaTotal = 0, mediaQuant = 0;
        // cálculo de média:
        for(int ct = 0; ct < cidade.length; ct++){
            mediaTotal += cidade[ct].quantidadeAcidentes;
            mediaQuant += 1;
        }
        mediaTotal = mediaTotal/mediaQuant;
        // saída, cidades com maiores quant. de acidentes que a média
        System.out.println("\nNome e quantidade de acidente das cidade acima da média: \n");
        for(int ct = 0; ct < cidade.length; ct++){
            if(cidade[ct].quantidadeAcidentes > mediaTotal){
                System.out.println(cidade[ct].nomeCidade + "\n" + cidade[ct].quantidadeAcidentes);
            }
        }
        // Mensagem de saída
        JOptionPane.showMessageDialog(null, "Verificação concluída.");
    }
}
