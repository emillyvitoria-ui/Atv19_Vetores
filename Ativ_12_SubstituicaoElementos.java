package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_12_SubstituicaoElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 numeros:");
        for (int i = 0; i< numeros.length;i++){
            numeros[i]= sc.nextInt();
        }
        numeros[2]=0;
        System.out.println("Vetor alterado:");
        for (int i = 0; i< numeros.length;i++){
            System.out.println(numeros[i]);
            if (i<numeros.length-1){
            }
        }
    }
}
