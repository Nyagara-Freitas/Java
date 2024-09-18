public class TabuadaDeCinco {

    public static void main(String[] args) {

        //TODO: CRIAR UMA TABUADA DE 5

    //DECLARAR UMA VARIAVEL QUE RECEBE 5
    int Numero5 = 5;

    // CRIAR UM LOOP FOR DE 1 A 10
        for(int i = 1; i <= 10; i++) {
            System.out.println(Numero5 + " x " + i + " = " + (Numero5 * i));
            try {
                // Espera por 1000 milissegundos (1 segundo)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Tratamento da exceção caso o thread seja interrompido
                e.printStackTrace();
            }
        }

    //EXIBIR A MENSAGEM NA TELA

    }
    
}
