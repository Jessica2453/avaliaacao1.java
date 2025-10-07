import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Realiza as conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados formatados
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        // Fecha o Scanner
        scanner.close();
    }
}
