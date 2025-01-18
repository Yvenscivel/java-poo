

public class Main{
    public static void main(String args[]){
        Fazenda farm = new Fazenda();
        farm.setNome("Fazenda Feliz");

        Bovino b1 = new Bovino('m');
        b1.setPeso(200);
        b1.setId(1000);
        System.out.println(b1.getId()+";"+b1.getPeso()+";"+b1.getGenero());


        VacaLeiteira b2 = new VacaLeiteira();
        b2.setPeso(240);
        b2.setId(1001);

        Bovino b3 = new Bovino('f');
        b3.setPeso(180);
        b3.setId(1002);

        farm.addBovino(b1);
        farm.addBovino(b2);
        farm.addBovino(b3);

        System.out.println(farm.getListaBovinos().size());
    }
}