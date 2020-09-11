package co.eeikee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = 0, mes = 0;

        System.out.print("Digite o dia so seu aniversario: ");
            dia = input.nextInt();

        System.out.print("Digite o dia so seu aniversario: ");
            mes = input.nextInt();



        if(dia < 1 || dia > 31 || mes < 1 || mes > 12){
            System.out.print("Data invalida");
        }
        else{
            System.out.print("dia " + dia + " mes " + mes);
        }

    }
}
