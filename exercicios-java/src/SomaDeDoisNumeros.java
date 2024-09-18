import java.util.Scanner;


public class SomaDeDoisNumeros{
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

     //TODO: SOMA DE DOIS NUMEROS

     //PRIMEIRO MANDO UMA MENSAGEM PRA PESSOA DIGITAR E CRIO UMA VARIAVEL PRO NUMERO 1
        System.out.println("Digite um número: ");
        int PrimeiroNumero = scanner.nextInt();

     //MANDO UMA MENSAGEM PRA PESSOA DIGITAR E CRIO UMA VARIAVEL PRO NUMERO 2
        System.out.println("Digite outro número: ");
        int SegundoNumero = scanner.nextInt();

     //CRIO UMA VARIAVEL QUE VAI SOMAR OS DOIS NUMEROS
        int Resultado = PrimeiroNumero + SegundoNumero;

     //IMPRIMO NA TELA O RESULTADO 
        System.out.println("O resultado é: " + Resultado);
    }
}




    //TODO: CRIAR UM SISTEMA DE MEDIA

    //