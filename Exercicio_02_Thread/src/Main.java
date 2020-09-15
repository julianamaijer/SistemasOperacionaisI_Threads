// Fazer uma aplicação que rode 5 Threads que
//cada uma delas imprima no console o seu
//número.

public class Main {

    public static void main(String[] args) {
        for ( int idThread = 0; idThread < 5; idThread++){
            Thread threadId = new ThreadId(idThread);
            threadId.start();
        }
    }

}