package CalcArea;

public class Circulo implements AreaCalculavel{
    float raio;
    final float pi = 3.14f;

    public Circulo(float raio) {
        if(raio > 0){
            this.raio = raio;
        }
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
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
