public class ThreadMatriz extends Thread {

    int vetor [];
    int linha;


    public ThreadMatriz(int vetor[], int linha){
        this.vetor = vetor;
        this.linha = linha;
    }

    @Override
    public void run() {
        this.calculaSoma();
    }

    public void calculaSoma(){
        int soma=0;
        for( int i = 0; i < 5; i++){
            soma = soma + vetor[i];
        }
        System.out.println("A soma da linha " + linha + " é: " + soma + ". O ID da Thread é: " + getId());
    }
}
