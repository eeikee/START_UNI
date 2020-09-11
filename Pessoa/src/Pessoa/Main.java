package Pessoa;

public class Main {
    public static void main(String[] args){
        double perc = 1.5;
        Funcionario funcionario1 = new Funcionario("Carlos","12345678910",1000.00);
        System.out.println(funcionario1.toString());
        funcionario1.setPercentual(perc);
        for(int i = 0; i < 3; i++){
            perc *= 2;
            funcionario1.setPercentual(perc);
            System.out.println(funcionario1.toString());
        }
    }
}
