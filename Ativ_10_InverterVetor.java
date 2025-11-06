package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_10_InverterVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cinco números:");
        int[] numeros = new int[5];

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite o número " + (contador + 1) + ":");
            numeros[contador] = sc.nextInt();
        }

        System.out.println("Vetor ordem original:");
        for (int contador = 0; contador < 5; contador++) {
            System.out.print(numeros[contador] + " ");
        }
        System.out.println("Vetor ordem invertida:");
        for (int contador = 4; contador >= 0; contador--) {
            System.out.print(numeros[contador] + " ");
        }
    }
}
