import javax.swing.JOptionPane;
public class Metodos {
    public Estatistica[] adicionarRegistro(Estatistica[] cidade){
        for(int i = 0; i < cidade.length;i++){
            cidade[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da " + (i+1) + "º cidade: "));
            cidade[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "º cidade: ");
            cidade[i].quantidadeAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da " + (i+1) + "º cidade: "));
        }
        return cidade;
    }

    public void verificarIntervalo(Estatistica[] cidade){
        int cidcont = 0;
        System.out.println("Cidades entre 100 e 500 acidentes: ");
        for(int c = 0; c < cidade.length; c++){
            if(cidade[c].quantidadeAcidentes > 100 && cidade[c].quantidadeAcidentes < 500){
                System.out.println("\nNome: "+ cidade[c].nomeCidade + "\nCódigo: " + cidade[c].codigoCidade);
                cidcont += 1;
            }
        }
        if(cidcont == 0){
            System.out.println("Nenhuma cidade está entre 100 e 500 acidentes.");
        }
        System.out.println("...");
    }

    public void maiorEMenor(Estatistica[] cidade){
        int maior = -1, menor = -1;
        int maiorci = -1, menorci = -1;
        for(int cto = 0; cto < cidade.length; cto++){
            if(maior == -1){
                maior = cidade[cto].quantidadeAcidentes;
                maiorci = cto;
                menor = cidade[cto].quantidadeAcidentes;
                menorci = cto;
            } else {
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
        System.out.println("Nome e quantidade de acidente das cidade acima da média: \n");
        for(int ct = 0; ct < cidade.length; ct++){
            if(cidade[ct].quantidadeAcidentes > mediaTotal){
                System.out.println(cidade[ct].nomeCidade + "\n" + cidade[ct].quantidadeAcidentes);
            }
        }

    }
}
