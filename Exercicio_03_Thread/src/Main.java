// Fazer uma aplicação que insira números
//aleatórios em uma matriz 3 x 5 e tenha 3
//Threads, onde cada Thread calcula a soma dos
//valores de cada linha, imprimindo a identificação
//da linha e o resultado da soma.

public class Main {
    public static void main(String[] args) {

        int matriz [][] = new int[3][5];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                matriz[i][j] = (int)(Math.random()*20);
                System.out.println(matriz[i][j]);
            }
        }

        for (int  t = 0; t < 3; t++){
            Thread thread = new ThreadMatriz(matriz[t],t);
            thread.start();
        }
    }
}
