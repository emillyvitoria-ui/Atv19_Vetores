package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_01_MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as cinco notas:");

        double soma = 0;
        double[] notas = new double[5];

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite a mota" + (contador + 1) + ":");
            notas[contador]= sc.nextDouble();

            if (notas[contador]<6){
                System.out.println("Nota abaixo da média");
            } else if (notas[contador]==6) {
                System.out.println("Nota está na média");

            }else {
                System.out.println("Nota acima da média");
            }
            soma+=notas[contador];
        }
        double media= soma/5;
        System.out.println("A média das notas é " +media);
    }
}