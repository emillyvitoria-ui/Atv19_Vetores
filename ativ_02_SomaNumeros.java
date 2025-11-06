package Ativ19_Vetores;

import java.util.Scanner;

public class ativ_02_SomaNumeros {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double[] numeros=new double[10];
       double soma= 0;

       for (int i =0; i< numeros.length; i ++){
           System.out.println("Digite os valores:"+(i+1));
           numeros[i]= sc.nextDouble();
           soma+= numeros[i];
       }
       if (soma>=0){
           System.out.println("A soma de todos os números é:"+soma);
       }

    }
}
