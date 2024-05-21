public class MovimentoContas {
    int codContaM;
    double valorM;
    int tipoM;
    int statusM;
    MovimentoContas(){
        this(0,0,0,0);
    } 
    MovimentoContas(int contas, double val, int tipo, int status){
        codContaM = contas;
        valorM = val;
        tipoM = tipo;
        statusM = status;
    }
}
