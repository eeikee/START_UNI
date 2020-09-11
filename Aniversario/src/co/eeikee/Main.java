package co.eeikee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = 0, mes = 0;

        while(dia < 1 && dia > 31){
            dia = input.nextInt();
            System.out.print("Digite o dia so seu aniversario: ");
        }
        while(dia < 1 && dia > 31){
            mes = input.nextInt();
            System.out.print("Digite o dia so seu aniversario: ");
        }

        if(dia < 1 && dia > 31 || mes < 1 && mes > 12){
            System.out.print("");
        }

    }
}
