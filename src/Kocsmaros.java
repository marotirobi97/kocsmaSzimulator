public class Kocsmaros extends Ember{
    private static final int OSSZPOHAR = 10;
    private int koszosPohar;

    public Kocsmaros(String nev, int kor, boolean ferfi, int penz) {
        super(nev, kor, ferfi, penz);
    }


    public void elmos() {
        if(this.koszosPohar != 0){
            this.koszosPohar--;
            System.out.println("Elmostam egy poharat.");
        }else{
            System.out.println("Nincs koszos pohár!");
        }
    }

    public void addPenz(int penz) {
        super.setPenz(super.getPenz() + penz);
    }

    public int getKoszosPohar() {
        return koszosPohar;
    }

    public void addKoszosPohar(int koszosPohar) {
        this.koszosPohar += koszosPohar;
    }

    public static int getOSSZPOHAR() {
        return OSSZPOHAR;
    }

    @Override
    public String toString() {
        return "Kocsmaros: " +
                super.toString() +
                ", koszosPohar=" + koszosPohar;
    }
}
