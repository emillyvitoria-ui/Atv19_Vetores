package Ativ19_Vetores;

import java.util.Scanner;

public class ativ_09_Divisiveis {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] numeros= new int[10];
       int contador= 0;
       System.out.println("Digite 10 números inteiros:");
       double soma = 0;
       double[] notas = new double[10];

       for (int i = 0;i<numeros.length;i++){
           numeros[i]= sc.nextInt();
       }
       for (int i = 0;i< numeros.length;i++){
           if (numeros[i]% 3==0){
               contador++;
           }
       }
       System.out.println("Divisíveis por 3:"+ contador );

    }
}
