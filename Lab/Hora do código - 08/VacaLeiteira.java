public class VacaLeiteira extends Bovino {

    private int quantDiariaLeite;

    public VacaLeiteira(){
        super('f');
    }

    public int getQuantDiariaLeite() {
        return quantDiariaLeite;
    }

    public void setQuantDiariaLeite(int quantDiariaLeite) {
        this.quantDiariaLeite = 0;
        this.quantDiariaLeite += quantDiariaLeite;
    }


}