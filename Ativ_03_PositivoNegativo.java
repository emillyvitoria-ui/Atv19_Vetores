package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_03_PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros= new double[8];
        int positivo=0;
        int negativo=0;
        for (int i = 0; i<numeros.length;i++){
            System.out.println("Digite o valor "+(i+1));
            numeros[i]= sc.nextDouble();

            if (numeros[i]>=0){
                positivo++;
            }else {
                negativo++;
            }
        }
        System.out.println("Quantidade de números positivos"+ positivo);
        System.out.println("Quantidade de números negativos"+ negativo);

    }
}
