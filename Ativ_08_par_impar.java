package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_08_par_impar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[6];
        System.out.println("Digite 6 números;");

        for (int i = 0; i < numeros.length;i++){
            numeros[i]= sc.nextInt();
        }
        System.out.println("Resultado:");
        for (int i = 0;i< numeros.length;i++){
            if (numeros[i]%2==0){
                System.out.println(numeros[i] +" é par");
            }else {
                System.out.println(numeros[i]+" é impar");
            }
        }
    }
}
