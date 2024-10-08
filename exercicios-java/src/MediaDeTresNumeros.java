import java.util.Scanner;

public class MediaDeTresNumeros {

    public static void main(String[] args) {
        // Passo 1: Leia três números do teclado.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("#----SISTEMA DE MEDIA DE 3----#");

        System.out.println("Digite o primeiro número: ");
        double PrimeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        double SegundoNumero = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        double TerceiroNumero = sc.nextInt();

        // Passo 2: Some os três números.
        double SomaDosNumeros = PrimeiroNumero + SegundoNumero + TerceiroNumero;

        // Passo 3: Divida a soma por 3 para obter a média.
        double Media = SomaDosNumeros / 3;

        // Passo 4: Exiba a média no console.
        System.out.println("A media dos três números é: " + Media);
    }
}
