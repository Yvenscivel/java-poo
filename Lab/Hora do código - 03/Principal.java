
public class Principal {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setLado1(1);
        t.setLado2(9);
        t.setLado3(5);
        System.out.println(t.perimetro());

        Triangulo t2 = new Triangulo();
        t2.setLado1(1);
        t2.setLado2(7);
        t2.setLado3(14);
        System.out.println(t2.area());

    }
    
}
    