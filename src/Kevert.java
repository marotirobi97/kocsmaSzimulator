public class Kevert extends Ital{

//    public Kevert(int ar, int alkoholtartalom) {
//        super(ar, alkoholtartalom);
//    }

    public Kevert(Ital ital1,Ital ital2){
        int alkoholtartalom = (ital1.getAlkoholtartalom() + ital2.getAlkoholtartalom())/2;
        int atlagAr = (ital1.getAr() + ital2.getAr())/2;
        super.setAlkoholtartalom(alkoholtartalom);
        super.setAr(atlagAr);
    }

    public Kevert(Ital ital1,Ital ital2, Ital ital3){
        int alkoholtartalom = (ital1.getAlkoholtartalom() + ital2.getAlkoholtartalom() + ital3.getAlkoholtartalom())/3;
        int atlagAr = (ital1.getAr() + ital2.getAr() + ital3.getAr())/3;
        super.setAlkoholtartalom(alkoholtartalom);
        super.setAr(atlagAr);
    }

    public Kevert(Ital ital1,Ital ital2, Ital ital3,Ital ital4){
        int alkoholtartalom = (ital1.getAlkoholtartalom() + ital2.getAlkoholtartalom() + ital3.getAlkoholtartalom() + ital4.getAlkoholtartalom())/4;
        int atlagAr = (ital1.getAr() + ital2.getAr() + ital3.getAr() + ital4.getAr())/4;
        super.setAlkoholtartalom(alkoholtartalom);
        super.setAr(atlagAr);
    }
}
