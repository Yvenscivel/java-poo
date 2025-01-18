public class Bovino {
    private int id;
    private float peso;
    private String raca;
    private char genero;

    public Bovino (char genero){
        this.genero = Character.toUpperCase(genero);
        
        if (genero != 'm' || genero != 'f'){
            this.genero = 'm';
        } 
        else{
            System.out.println("nada");
        }
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >= 1000 & id <= 9999){
            this.id = id;
        }
        else{
            System.out.println("insira somente id entre 1000 e 9999");
        }
        
    }
    
    public char getGenero() {
        return genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso > 15){
            this.peso = peso;
        }
        else{
            System.out.println("insira somente peso maior que 15");
        }
    }


}