//Fazer uma aplica��o de uma corrida de sapos, com 5
//Threads, cada Thread controlando 1 sapo. Deve haver um
//tamanho m�ximo para cada pulo do sapo (em metros) e a
//dist�ncia m�xima para que os sapos percorram. A cada salto,
//um sapo pode dar uma salto de 0 at� o tamanho m�ximo do
//salto (valor aleat�rio). Ap�s dar um salto, a Thread, para cada
//sapo, deve mostrar no console, qual foi o tamanho do salto e
//quanto o sapo percorreu. Assim que o sapo percorrer a
//dist�ncia m�xima, a Thread deve apresentar que o sapo
//chegou e qual sua coloca��o.

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        corrida.iniciaCorrida();
    }
}
