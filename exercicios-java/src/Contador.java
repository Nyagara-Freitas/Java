public class Contador {
    public static void main(String[] args) {
        //TODO: CRIAR UM CONTADOR DE 1 A 10

    //CRIAR UM LOOP FOR INICIANDO DE 1 E TERMINANDO EM 10
    // variàvel inicial; limitador; incremento ou decremento
    for (int i = 1; i <= 10; i++){
        System.out.println("O valor é: " + i);
        try {
            // Espera por 1000 milissegundos (1 segundo)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Tratamento da exceção caso o thread seja interrompido
            e.printStackTrace();
        }
    }

    //EXIBIR UMA MENSAGEM NA TELA COM A CONTAGEM 

        
    }
}

