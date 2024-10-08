import java.util.Scanner;

public class ConversaoDeTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Passo 1: Leia a temperatura em graus Celsius.
        System.out.println("Escreva a temperatura em Graus Celsius: ");
        double Temperatura = sc.nextInt();

        // Passo 2: Aplique a fórmula de conversão para Fahrenheit (F = C * 9/5 + 32).
        double Resultado = (Temperatura * 9/5) + 32;
        

        // Passo 3: Exiba a temperatura convertida em Fahrenheit.
        System.out.println("A conversão em Fahrenheit é: " + Resultado);

    }

}
