package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_04_MaiorMenor {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double[] numero = new double[6];
       for (int i = 0;i < numero.length; i++){
           System.out.println("Digite o número "+(i+1)+":");
           numero[i]= sc.nextDouble();
       }
       double maior= numero[0];
       double menor = numero[0];

        for (int i =1; i < numero.length;i++) {
            if (numero[i] > maior) {
                maior = numero[i];
            } else if (numero[i] < menor) {
                menor = numero[i];
            }
        }
       System.out.println("Número maior:"+maior);
       System.out.println("Número menor"+menor);;
    }
}
