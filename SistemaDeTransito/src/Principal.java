import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        // Estancia de classe em # registros de vetor:
        Estatistica[] cid = new Estatistica[3];
        // Estanciar os métodos (função/procedimentos):
        Metodos metodos = new Metodos();
        // Executar o construtor:
        for(int i = 0; i < cid.length; i++){
            cid[i] = new Estatistica();
        }
        // Definir variáveis:
        int loopEntrada = 0;
        // Loop-Início:
        while (loopEntrada != 9) {
            loopEntrada = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU ESTATÍSTICA\n[1] - Cadastro de estatística.\n[2] - Consulta por quantidade de acidente.\n[3] - Consulta por estatística de acidente.\n[4] - Acidentes acima da média.\n[9] - Finalizar programa."));
                switch (loopEntrada) {
                    case 1:
                        metodos.funcRegis(cid);
                        break;
                    case 2:
                        metodos.qtdAcidentes(cid);
                        break;
                    case 9:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção inválida");
                        break;
                }
        }
    }
}
