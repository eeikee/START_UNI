package Pessoa;

public class Funcionario extends Pessoa{
    double salario_inicial;
    double percentual;
    double salario_atual;

    boolean primeiro_salario = false;

    public Funcionario(String nome, String rg, double salario_inicial) {
        this.nome = nome;
        this.rg = rg;
        this.salario_inicial = salario_inicial;
    }

    public double getSalario_inicial() {
        return salario_inicial;
    }

    public void setSalario_inicial(double salario_inicial) {
        this.salario_inicial = salario_inicial;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getSalario_Total() {
        return salario_Total;
    }

    public void setSalario_Total() {
        this.primeiro_salario = true;
        this.salario_Total = salario_atual*(1+(getPercentual()/100));
    }

    public void salario_atual(double salario){
        if(!primeiro_salario){
            this.salario_atual = salario_inicial;
        }
        this.salario_atual = getSalario_Total();
    }
    double salario_Total;

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + this.salario_atual +
                ", nome='" + this.nome + '\'' +
                ", rg='" + this.rg + '\'' +
                '}';
    }
}
