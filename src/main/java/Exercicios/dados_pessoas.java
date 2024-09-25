package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

    public static void main(String[] args) {

        int n, qtdHomens, qtdMulheres;
        double menorAltura, maiorAltura, mediaFemAltura, totalFemAltura;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        mediaFemAltura = 0;
        totalFemAltura = 0;
        qtdHomens = 0;
        qtdMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a " + "pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a " + "pessoa: ");
            generos[i] = sc.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];

            }
        }

        for (int i = 0; i < n; i++) {
            if (generos[i] == 'M' || generos[i] == 'm') {
                qtdHomens++;

            } else {
                qtdMulheres++;
                totalFemAltura = totalFemAltura + alturas[i];
            }
        }

        mediaFemAltura = totalFemAltura / qtdMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaFemAltura);
        System.out.println("Numero de homens = " + qtdHomens);

        sc.close();
    }

}
