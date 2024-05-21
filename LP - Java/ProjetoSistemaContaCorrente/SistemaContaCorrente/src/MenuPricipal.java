import javax.swing.JOptionPane;
public class MenuPricipal {
    public static void main(String[] args) {
        // Definir variaveis:
        int menu = 0;
        while (menu != 9) { // Loop de Entrada:
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU PRINCIPAL " +
                "\n[1] - " +
                "\n[2] - " +
                "\n[3] - " +
                "\n[4] - " +
                "\n[9] - SAIR."));
            switch (menu) {
                case 1: // cadastro de contas correntes:

                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                case 9:
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        }
    }
}
