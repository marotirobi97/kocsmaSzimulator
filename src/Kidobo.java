public class Kidobo extends Ember{
    private boolean dologzik;
    static int hanyKidoboDolgozik;

    public Kidobo(String nev, int kor, boolean ferfi, int penz) {
        super(nev, kor, ferfi, penz);
        hanyKidoboDolgozik++;
    }


    public void setSzolgalatbaAll(){
        if(this.dologzik){
            System.out.println("Már szolgálatban van!");
        }else{
            this.dologzik = true;
            hanyKidoboDolgozik++;
        }
    }

    public void setSzolgalatbolKilep(){
        if(!this.dologzik){
            System.out.println("Már kilépet a szolgálatból!");
        }else{
            this.dologzik = false;
            hanyKidoboDolgozik--;
        }
    }

    @Override
    public void iszik(Kocsmaros kocsmaros, Ital ital) {
        if(this.dologzik){
            if(ital.getAlkoholtartalom() == 0){
                super.iszik(kocsmaros, ital);
            }else{
                System.out.println("Nem ihat alkoholtartalmú italt szolgálat alatt!");
            }
        }else{
            super.iszik(kocsmaros, ital);
        }
    }

    @Override
    public void iszik(Kocsmaros kocsmaros) {
        if(this.dologzik){
            System.out.println("Nem ihat alkoholtartalmú italt szolgálat alatt!");
        }else{
            super.iszik(kocsmaros);
        }
    }

    @Override
    public String toString() {
        return "Kidobo: " + super.toString() + "dologzik=" + dologzik;
    }
}
