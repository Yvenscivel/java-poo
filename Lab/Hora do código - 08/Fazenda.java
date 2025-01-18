import java.util.ArrayList;

public class Fazenda {
    private String nome;
    private ArrayList<Bovino> bovinos;

    public Fazenda(){
        this.bovinos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bovino> getListaBovinos() {
        return bovinos;
    }

    public void addBovino(Bovino bovino){
        this.bovinos.add(bovino);
    }

    public Bovino getBovino(int id){
        for (Bovino b : bovinos){
            if(b.getId() == id){
                return b;
            }
        }
        return null;

    }

}   
