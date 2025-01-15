public class Main {
    public static void main(String[] args){
        Product p = new Product("yvens", 299.90, 1);
        System.out.println(" ");
        System.out.println(p.name);
        System.out.println(p.price);
        System.out.println(p.quantity);

        Product p2 = new Product("Cauê", 19.2);
        System.out.println(" ");
        System.out.println(p2.name);
        System.out.println(p2.price);
        
        Product p3 = new Product();
        System.out.println(" ");
        p3.name = "Digão";
        p3.price = 300;
        p3.quantity = 12;
        System.out.println(p3.name);
        System.out.println(p3.price);
        System.out.println(p3.quantity);
        
    }
}