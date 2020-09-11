package CalcArea;

public class Retangulo implements AreaCalculavel{
   float altura;
   float largura;
   final float pi = 3.14f;

    public Retangulo(float altura, float largura) {
        if(altura > 0){
            this.largura = largura;
        }
        if(largura > 0){
            this.altura = altura;
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
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
