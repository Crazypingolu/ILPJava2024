import javax.swing.JOptionPane;
public class MetodosEstatisticas {
    public void eleitorPSecao(Votacao[] voto){
        // Criar váriaveis locais:
        int contabilizador, c;
        for(c = 0 ; c < 11 ; c ++){
            contabilizador = 0;
            for(int cto = 0 ; cto < voto.length ; cto++){
                if(voto[cto].numeroSecao == c){
                    contabilizador += 1;
                }
            }
            System.out.println(
                "Total de eleitores na seção " + c +": " + contabilizador);
        }
        JOptionPane.showMessageDialog(
                null, "Consulta concluída.");
    }
    public void maiorMenorEleitores(Votacao[] voto){
        // criar variáveis:
        int[] aux = new int[11];
        int valorMaior = -1, valorMenor = 0, indiceMa = 0, indiceMe = 0;
        // processamento
        for(int c = 0 ; c < voto.length ; c ++){
            aux[voto[c].numeroSecao] +=1;
        }
        for(int i = 0 ; i < aux.length ; i ++){
            if (valorMaior == -1) {
                valorMaior = aux[i];
                indiceMa = i;
                valorMenor = aux[i];
                indiceMe = i;                
            } else {
                if(aux[i] > valorMaior){
                    valorMaior = aux[i];
                    indiceMa = i;
                }
                if (aux[i] < valorMenor) {
                    valorMenor = aux[i];
                    indiceMe = i;                    
                }
            }
        }
        JOptionPane.showMessageDialog(null,
        "Seção com MAIOR quantidade de Eleitores: " + indiceMa +
        "\nSeção com MENOR quantidade de Eleitores: " + indiceMe);
    }
    public void votoCandidato(Votacao[] voto){
        // criar variáveis:
        int[] aux = new int[301];
        // processamento
        for(int c = 0 ; c < voto.length ; c ++){
            aux[voto[c].numeroCandidato] +=1;
        }
        for(int i = 0 ; i < aux.length ; i ++){
            System.out.println("Candidato " + i +": " + aux[i] + " votos");
        }
    }
    public void top10(Votacao[] voto){
        // criar variáveis:
        int[] aux = new int[301];
        int valorMaior = -1, indiceMa = 0;
        // processamento encher o auxiliar:
        for(int c = 0 ; c < voto.length ; c ++){
            aux[voto[c].numeroCandidato] +=1;
        }
        // calculo de maior e mostrar:
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0 ; j < aux.length ; j++){
                if(valorMaior == -1){
                    valorMaior = aux[j];
                    indiceMa = j;
                } else {
                    if(aux[j] > valorMaior){
                        valorMaior = aux[j];
                        indiceMa = j;
                    }
                }
            }
            if (i == 0) {
                System.out.println("\nTOP COLOCADOS:");
            }
            System.out.println((i + 1) + "º Candidato: " + indiceMa + ", com " + aux[indiceMa] + " votos");
            aux[indiceMa] = 0;
            valorMaior = -1;
        }
        JOptionPane.showMessageDialog(
            null, "Consulta concluída."
        );
    }
}
