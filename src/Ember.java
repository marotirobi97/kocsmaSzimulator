public class Ember {
    private String nev;
    private int kor;
    private boolean ferfi;
    private int penz;
    private int reszegseg;
    private boolean kocsmaban;

    public Ember(String nev, int kor, boolean ferfi, int penz) {
        this.nev = nev;
        this.kor = kor;
        this.ferfi = ferfi;
        this.penz = penz;
        this.reszegseg = 0;
        this.kocsmaban = false;
    }

    public void kotozkodik(Ember kivel){
        int hanyKidoboDolgozik = Kidobo.hanyKidoboDolgozik;
        if(hanyKidoboDolgozik >= 1){
            System.out.print(this.nev + " ");
            this.hazamegy();
        }else{
            System.out.println("Jót kötözködött.");
        }
    }

    public void iszik(Kocsmaros kocsmaros,Ital ital){
        if(!this.kocsmaban){
            this.jon();
        }
        if(this.reszegseg < 40){
            if (this.penz >= 1) {
                if(Kocsmaros.getOSSZPOHAR() == kocsmaros.getKoszosPohar()){
                    System.out.println("Nincs tiszta pohár!");
                }else{
                    if (this.penz >= ital.getAr()) {
                        this.penz -= ital.getAr();
                        this.reszegseg += ital.getAlkoholtartalom();
                        kocsmaros.addKoszosPohar(1);
                        kocsmaros.addPenz(ital.getAr());
                    } else {
                        System.out.println("Nincs elég pénz a piára :(((");
                    }
                }
            }else{
                System.out.println("Nincs elegendő pénz!");
            }
        }else{
            this.alszik();
        }
    }

    public void iszik(Kocsmaros kocsmaros){
        if(!this.kocsmaban){
            this.jon();
        }
        if(this.reszegseg < 40){
            if (this.penz >= 1) {
                if(Kocsmaros.getOSSZPOHAR() == kocsmaros.getKoszosPohar()){
                    System.out.println("Nincs tiszta pohár!");
                }else{
                    if (this.penz >= 1) {
                        this.penz--;
                        this.reszegseg++;
                        kocsmaros.addKoszosPohar(1);
                        kocsmaros.addPenz(1);
                    } else {
                        System.out.println("Nincs elég pénz a piára :(((");
                    }
                }
            }else{
                System.out.println("Nincs elegendő pénz!");
            }
        }else{
            this.alszik();
        }
    }

    public void alszik(){
        this.reszegseg = 0;
        System.out.println("Elaludt.");
    }

    public void hazamegy(){
        this.kocsmaban = false;
        System.out.println("Haza ment.");
    }

    public void jon(){
        this.kocsmaban = true;
        System.out.println("A kocsmába van.");
    }

    public void koszon(){
        System.out.println("Szia! " + nev + " vagyok és " + kor + " éves, mellesleg " + (ferfi ? "férfi." : "nő."));
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public boolean isFerfi() {
        return ferfi;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    public String toString() {
        return "Az ember neve: " + this.nev +
                ", aki " + this.kor + " éves " +
                (this.ferfi ? "férfi" : "nő.") + " Pénz: " + this.penz + ", Reszegség: " + this.reszegseg;
    }
}
