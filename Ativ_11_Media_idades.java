package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_11_Media_idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;
        System.out.println("Digite cinco idades:");

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite a idade " + (contador + 1) + ":");
            idades[contador] = sc.nextInt();
            soma += idades[contador];
        }
        double media = soma / 5.0;
        System.out.println("Idades digitadas:");
        for (int contador = 0; contador < 5; contador++) {
            System.out.print(idades[contador] + " ");
        }
        System.out.println("Média das idades: " + media);

    }
}
