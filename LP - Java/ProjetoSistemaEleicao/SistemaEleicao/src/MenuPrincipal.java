/* 
 * Programa: Sistema eleitoral
 * Programador: LucasP, Crazypingolu
 * versão: 1.0
*/
import javax.swing.JOptionPane;
public class MenuPrincipal {
    public static void main(String[] args){
        // Instancias de classe:
        // Classe Eleitor (Como vetor):
        Eleitor[] eleitores = new Eleitor[10];
        for(int consE = 0 ; consE < eleitores.length ; consE++){ // iniciar o construtor de "eleitores":
            eleitores[consE] = new Eleitor();
        }
        // Classe MetodosMenuPrincipal (como função):
        MetodosMenuPrincipal metodosMP = new MetodosMenuPrincipal();
        // Classe Votacao apuração + seção 01 + seção 02 (como vetor):
        Votacao[] apuracao = new Votacao[10]; // instancia
        for(int conA = 0 ; conA < apuracao.length ; conA++){ // construtor
            apuracao[conA] = new Votacao();
        }
        Votacao[] votacao01 = new Votacao[5]; // instancia
        for(int conV1 = 0 ; conV1 < votacao01.length ; conV1++){ // construtor
            votacao01[conV1] = new Votacao();
        }
        Votacao[] votacao02 = new Votacao[5]; // instancia
        for(int conV2 = 0 ; conV2 < votacao02.length ; conV2++){ // construtor
            votacao02[conV2] = new Votacao();
        }
        int menu = 0;// variável loop - menu principal
        while(menu != 9){
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU PRINCIPAL:" +
                "\n[1] - Cadastrar eleitor." +
                "\n[2] - Cadastrar votação (1 e 2)." +
                "\n[3] - Agrupar apuração." +
                "\n[4] - Estatísticas. " + 
                "\n[9] - Finalizar programa."));
            switch(menu){
                case 1: // Cadastrar 10 eleitores:
                    metodosMP.CadastraEleitor(eleitores);
                break;
                case 2:
                    CadastraVotacao(votacao01, votacao02, eleitores);
                break;
                case 3:
                    metodosMP.agrupar(votacao01, votacao02, apuracao);
                break;
                case 4:
                    ConsultaEstatisticas(apuracao, eleitores);
                break;
                case 9:
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;
            }
        }
    }
    // Menu cadastra votos:
    static void CadastraVotacao(Votacao[] votos01, Votacao[] votos02, Eleitor[] eleitor){
        // metodos pro menu votação:
        MetodosMenuVota metodosVT = new MetodosMenuVota();
        // DEFINIR VARIÁVEIS:
        int menuVota = 0;
        while (menuVota != 9) {
            menuVota = Integer.parseInt(JOptionPane.showInputDialog(
                "CADASTRO DE VOTAÇÕES:" +
                "\n[1] - Cadastrar Votação 01." +
                "\n[2] - Cadastrar votação 02." +
                "\n[9] - Voltar ao MENU PRINCIPAL."));
            switch (menuVota) {
                case 1:
                    metodosVT.CadastraVota01(votos01, eleitor);
                break;
                case 2:
                    metodosVT.CadastraVota02(votos02, eleitor);
                break;
                case 9:
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;
            }         
        }
    }
    // Menu ConsultaEstatisticas:
    static void ConsultaEstatisticas(Votacao[] votos, Eleitor[] eleitores){
        // metodos pro consulta Estatisticas:
        MetodosMenuConsu metodosCE = new MetodosMenuConsu();
        // definir variáveis:
        int menuConsulta = 0;
        while(menuConsulta != 9){
            menuConsulta = Integer.parseInt(JOptionPane.showInputDialog(
               "MENU ESTATÍSTICA:" +
               "\n[1] - Vencedor. " +
               "\n[2] - Segundo colocado. " +
               "\n[3] - Votos em branco. " +
               "\n[4] - Votos nulos. " +
               "\n[5] - Mostrar eleitores. " +
               "\n[6] - Mostrar apuração. " +
               "\n[9] - Voltar ao MENU PRINCIPAL. "
            ));
            switch (menuConsulta) {
                case 1:
                    metodosCE.vencedor(votos);
                break;
                case 2:
                    metodosCE.segundoLugar(votos);
                break;
                case 3:
                    metodosCE.votosEmBranco(votos);
                break;
                case 4:
                    metodosCE.votosNulos(votos);
                break;
                case 5:
                    metodosCE.mostraEleitores(eleitores);
                break;
                case 6:
                    metodosCE.mostraApuracao(votos);
                break;
                case 9:
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;
            }
        }
    }
}