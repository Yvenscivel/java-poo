    public class Triangulo extends FormaGeometrica {
        float lado1;
        float lado2;
        float lado3;

        public void setLado1(float lado1){
            this.lado1 = lado1;
        }

        public void setLado2(float lado2){
            this.lado2 = lado2;
        }

        public void setLado3(float lado3){
            this.lado3 = lado3;
        }

        public float perimetro(){
            if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2){
                return lado1 + lado2 + lado3;
            }
            return 0;   
        }

        public float area(){
            float s = (lado1 + lado2 + lado3)/2;
            float resultado = (float) Math.sqrt((s*(s - lado1)*(s-lado2)*(s-lado3)));
            if (Double.isNaN(resultado)){
                return 0;
            }
            return resultado;
        }
    }
