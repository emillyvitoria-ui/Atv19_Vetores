package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_07_preencher_Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[5];
        System.out.println("Digite cincos números:");
        for (int i =0;i< numeros.length;i++){
            numeros[i]= sc.nextInt();
        }
        System.out.println("Vetor preencido:[");
        for (int i = 0; i< numeros.length;i++){
            System.out.println(numeros[i]);
            if (i< numeros.length-1){
            }
        }

    }
}
