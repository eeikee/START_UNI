package co.eeikee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vezes = 0;
        final String encomoda = "encomoda";


        while (vezes < 1){
            System.out.println("Digite quantas vezes o elefante encomoda: ");
            vezes = input.nextInt();
        }

        for (int i = 0; i < vezes; i++){
            System.out.printf("Incomoda ");
        }
        System.out.printf("muito mais");
    }
}
