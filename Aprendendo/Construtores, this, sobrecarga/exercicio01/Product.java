public class Product{
    public String name;
    public double price;
    public int quantity;

    public Product(){} //construtor padrao
    
    public Product(String name, double price, int quantity){ // construtor com parametros 
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Product(String name, double price){   // construtor sobrecarga com parametros
        this.name = name;
        this.price = price;
    }
}