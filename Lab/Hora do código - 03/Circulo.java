public class Circulo extends FormaGeometrica{
    float raio;
    public final static float PI = 3.14f;

    public void setRaio(float raio){
        this.raio = raio;
    }

    public float perimetro(){
        return 2*PI*raio;
    }

    public float area(){
        return PI * (raio*raio);
    }
}
