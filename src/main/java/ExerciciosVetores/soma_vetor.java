package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();

        double[] vetor = new double[n];
        double soma, media;

        soma = 0;
        media = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        media = soma / n;

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}
