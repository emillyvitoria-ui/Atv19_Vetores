package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_06_buscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new  int[10];
        int contador=0;

        System.out.println("Digite 10 números:");
        for (int i=0;i<numeros.length;i++){
            numeros[i]= sc.nextInt();
        }
        System.out.println("Digite um número para buscar:");
        int nume = sc.nextInt();

        for (int i=0;i<numeros.length;i++){
            if (numeros[i]==nume){
                contador++;
            }
        }
        if (contador>0){
            System.out.println("Número encontrado");
        }else
            System.out.println("Número não encontrado");
    }
}
