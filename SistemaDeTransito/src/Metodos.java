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
            if(cidcont == 0){
                System.out.println("Nenhuma cidade está entre 100 e 500 acidentes.");
            }
        }
        System.out.println("...");
    }
}
