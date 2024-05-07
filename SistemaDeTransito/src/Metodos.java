import javax.swing.JOptionPane;
public class Metodos {
    public Estatistica[] funcRegis(Estatistica[] cidade){
        for(int i = 0; i < cidade.length;i++){
            cidade[i].codigoDaCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da " + (i+1) + "º cidade: "));
            cidade[i].nomeDaCidade = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "º cidade: ");
            cidade[i].quantidadeDeAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da " + (i+1) + "º cidade: "));
        }
        return cidade;
    }

    public void qtdAcidentes(Estatistica[] cidade){
        int cidcont = 0;
        System.out.println("Cidades entre 100 e 500 acidentes: ");
        for(int c = 0; c < cidade.length; c++){
            if(cidade[c].quantidadeDeAcidentes > 100 && cidade[c].quantidadeDeAcidentes < 500){
                System.out.println("\nNome: "+ cidade[c].nomeDaCidade + "\nCódigo: " + cidade[c].codigoDaCidade);
                cidcont += 1;
            }
        }
        if(cidcont == 0){
            System.out.println("Nenhuma cidade está entre 100 e 500 acidentes.");
        }
        System.out.println("...");
    }

    public void maimen(Estatistica[] cidade){
        int maior = -1, menor = -1;
        int maiorci = -1, menorci = -1;
        for(int cto = 0; cto < cidade.length; cto++){
            if(maior == -1){
                maior = cidade[cto].quantidadeDeAcidentes;
                maiorci = cto;
                menor = cidade[cto].quantidadeDeAcidentes;
                menorci = cto;
            } else {
                if(cidade[cto].quantidadeDeAcidentes > maior){
                    maior = cidade[cto].quantidadeDeAcidentes;
                    maiorci = cto;
                }
                if(cidade[cto].quantidadeDeAcidentes < menor){
                    menor = cidade[cto].quantidadeDeAcidentes;
                    menorci = cto;
                }
            }
        }
        System.out.println("\nCidade com a maior quantidade de acidentes: " + cidade[maiorci].nomeDaCidade);
        System.out.println("Quantidade de acidentes: " + cidade[maiorci].quantidadeDeAcidentes);
        System.out.println("\nCidade com a menor quantidade de acidentes: " + cidade[menorci].nomeDaCidade);
        System.out.println("Quantidade de acidentes: " + cidade[menorci].quantidadeDeAcidentes);
    }

    public void maMedia(Estatistica[] cidade){
        // definir variáveis:
        int mediaTotal = 0, mediaQuant = 0;
        // cálculo de média:
        for(int ct = 0; ct < cidade.length; ct++){
            mediaTotal += cidade[ct].quantidadeDeAcidentes;
            mediaQuant += 1;
        }
        mediaTotal = mediaTotal/mediaQuant;
        // saída, cidades com maiores quant. de acidentes que a média
        System.out.println("Nome e quantidade de acidente das cidade acima da média: \n");
        for(int ct = 0; ct < cidade.length; ct++){
            if(cidade[ct].quantidadeDeAcidentes > mediaTotal){
                System.out.println(cidade[ct].nomeDaCidade + "\n" + cidade[ct].quantidadeDeAcidentes);
            }
        }

    }
}
