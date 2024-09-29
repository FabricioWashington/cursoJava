package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

    public static void main(String[] args) {

        int n, qtdPares;


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");

        qtdPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            // logica do if
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);

                qtdPares++;
            }

        }
        System.out.printf("QUANTIDADE DE PARES = ", qtdPares);

        sc.close();


    }
}
