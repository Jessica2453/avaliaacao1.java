import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];
        
        System.out.println("Digite as 8 notas anuais:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        // Calculando médias bimestrais
        double media1b = (notas[0] + notas[1]) / 2;
        double media2b = (notas[2] + notas[3]) / 2;
        double media3b = (notas[4] + notas[5]) / 2;
        double media4b = (notas[6] + notas[7]) / 2;
        
        // Calculando médias semestrais
        double media1s = (media1b + media2b) / 2;
        double media2s = (media3b + media4b) / 2;
        
        // Média final
        double mediaFinal = (media1s + media2s) / 2;
        
        // Apresentando resultados
        System.out.println("\nPráticas\n");
        System.out.printf("1º Bimestre: %.1f\n", media1b);
        System.out.printf("2º Bimestre: %.1f\n", media2b);
        System.out.printf("1º Semestre: %.1f\n", media1s);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f\n", media3b);
        System.out.printf("4º Bimestre: %.1f\n", media4b);
        System.out.printf("2º Semestre: %.1f\n", media2s);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        sc.close();
    }
}
