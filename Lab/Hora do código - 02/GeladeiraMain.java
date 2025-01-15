
public class GeladeiraMain {
    public static void main(String[] args) {
        Geladeira g = new Geladeira();
        g.marca = "Brastemp";
        g.cor = "Inox";
        g.voltagem = 220;
        g.temperaturaAtual = 7.4;
        g.portaAberta = true;

        System.out.println(g.marca + " " + g.cor + " " + g.voltagem + " " + g.temperaturaAtual + " " + g.portaAberta);

    }
}