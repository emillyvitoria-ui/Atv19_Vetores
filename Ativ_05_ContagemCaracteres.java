package Ativ19_Vetores;

import java.util.Scanner;

public class Ativ_05_ContagemCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palavra = new String[5];
        int contador=0;
        for (int i = 1 ; i< palavra.length;i++){
            System.out.println("Digite uma palavra:");
            palavra[i]= sc.nextLine();

            if (palavra[i].length()>=5){
                contador++;
            }
        }
        System.out.println("Palavras com mais de cinco caracteres"+contador);

    }
}
