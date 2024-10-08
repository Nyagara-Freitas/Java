import java.util.Scanner; // Importa a classe Scanner

public class NumeroParOuImpar {

    public static void main(String[] args) {
        // passo 0: criar um obejeto scanner
        Scanner sc = new Scanner(System.in);

        // Passo 1: Leia/input um número digitado no teclado.
        System.out.println("Digite um número: ");
        int NumeroDigitado = sc.nextInt();

        // Passo 2: Verifique se o número é divisível por 2.
        if (NumeroDigitado % 2 == 0) {
            System.out.println("Par"); //Se for divisível, exiba mensagem "Par"
        } else {
            System.out.println("Impar"); //Caso contrário, exiba mensagem "Ímpar"
        }
        

    }

}
