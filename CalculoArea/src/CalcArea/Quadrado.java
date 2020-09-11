package CalcArea;

public class Quadrado implements AreaCalculavel{
    float lado;
    final float pi = 3.14f;

    public Quadrado(float lado) {
        if(lado > 0){
            this.lado = lado;
        }
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float AreaDoQuadrado(float lado) {
        return lado * lado;
    }

    @Override
    public float AreaDoRetangulo(float largura, float altura) {
        return largura * altura;
    }

    @Override
    public float AreaDoCirculo(float raio) {
        return (float) (pi*Math.pow(raio,2));
    }
}
