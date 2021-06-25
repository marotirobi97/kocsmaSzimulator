import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Ember jozsi = new Ember("József",56,true,100);

        Kocsmaros pistaKocsmaros = new Kocsmaros("István",30,true,150);
//
//        jozsi.iszik(pistaKocsmaros);
//        System.out.println(jozsi);
//        System.out.println(pistaKocsmaros);
//        System.out.println();
//
//        Ital unicum = new Ital(5,2);
//        jozsi.iszik(pistaKocsmaros,unicum);
//
//        System.out.println(jozsi);
//        System.out.println(pistaKocsmaros);
//        System.out.println();
//
//        jozsi.iszik(pistaKocsmaros,unicum);
//        System.out.println(jozsi);
//        System.out.println(pistaKocsmaros);
//
//        jozsi.hazamegy();
//
//        System.out.println();
//        pistaKocsmaros.elmos();
//        pistaKocsmaros.elmos();
//        System.out.println(pistaKocsmaros);


//        Sor sor1 = new Sor(4,6);
//        Sor sor2 = new Sor(7,9);
//        Bor bor1 = new Bor(3,6,1988);
//
//        Kevert kevert1 = new Kevert(sor1,sor2,bor1);
//
//        jozsi.iszik(pistaKocsmaros,kevert1);
//        System.out.println(jozsi);
//        System.out.println(pistaKocsmaros);
//        System.out.println();

        Kidobo jani = new Kidobo("János",33,true,10);
        Ember bela = new Ember("Béla",45,true,50);
//
//        jozsi.kotozkodik(bela);


        Diak tomi = new Diak("Tamás",18,true,200,50);
//
//        tomi.tanul(2);
//        System.out.println(tomi);

        Diak anett = new Diak("Anett",24,false,180,90);
        Ember regina = new Ember("Regina",41,false,200);
        Ember monika = new Ember("Mónika",18,false,300);

        List<Ember> emberList = Arrays.asList(jozsi,pistaKocsmaros,jani,bela,tomi,anett,regina);
        List<Ember> emberList1 = Arrays.asList(jozsi,pistaKocsmaros,jani,bela,tomi,monika);
        Service service = new Service();
//        service.nevSorrend(emberList).forEach(System.out::println);
//        service.sortOnlyFemale(emberList).forEach(System.out::println);
//        System.out.println("Ennyi nő van a listában: " + service.countFemale(emberList));
//        service.emberekNevei(emberList).forEach(System.out::println);
//        service.egyEvvelIdosebb(emberList).forEach(System.out::println);
//        service.ketListaOsszefuzese(emberList,emberList1).forEach(System.out::println);


    }
}
