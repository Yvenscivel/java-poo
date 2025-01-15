public class Quadrado extends FormaGeometrica{
    float lado;

    public void setLado(float lado){
        this.lado = lado;
    }
    
    public float perimetro(){
        return 4*lado;
    }

    public float area(){
        return lado*lado;
    }
    
}