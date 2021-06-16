public class Diak extends Ember{

    private int osztonDij;

    public Diak(String nev, int kor, boolean ferfi, int penz,int osztonDij) {
        super(nev, kor, ferfi, penz);
        this.osztonDij = osztonDij;
    }

    public void tanul(){
        super.setPenz(super.getPenz() + this.osztonDij);
    }

    public void tanul(int mennyit){
        super.setPenz(super.getPenz() + (this.osztonDij * mennyit));
    }

    @Override
    public String toString() {
        return "Diak: " + super.toString() + " osztonDij=" + osztonDij ;
    }
}
