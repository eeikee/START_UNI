package CalcArea;

public class Teste {
    public static void main(String[] args){

        Quadrado quadrado = new Quadrado(5.2f);
        Retangulo retangulo = new Retangulo(2.5f,3.7f);
        Circulo circulo = new Circulo(22.9f);

        System.out.println( quadrado.AreaDoQuadrado(quadrado.getLado()));
        System.out.println(retangulo.AreaDoRetangulo(retangulo.getLargura(),retangulo.getAltura()));
        System.out.println(circulo.AreaDoCirculo(circulo.getRaio()));




    }
}
