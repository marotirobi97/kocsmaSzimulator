import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service {

//1 Írj egy függvényt, ami paraméterként egy ember listát vár és visszatér a lista név alapján sorbarendezett változatával.
    public List<Ember> nevSorrend(List<Ember> emberList){
        return emberList.stream()
                .sorted(Comparator.comparing(Ember::getNev))
                .collect(Collectors.toList());
    }

//2 Írj egy függvényt, ami paraméterként egy ember listát vár és visszatér egy ember listával,
// ami csak az eredeti lista női tagjait tartalmazza.
    public List<Ember> sortOnlyFemale(List<Ember> emberList){
        return emberList.stream()
                .filter(ember -> !ember.isFerfi())
                .collect(Collectors.toList());
    }

//3 Írj egy függvényt, ami paraméterként egy ember listát vár és visszatér azzal, hogy hány nő van a listában.
    public long countFemale(List<Ember> emberList){
        return emberList.stream()
                .filter(ember -> !ember.isFerfi())
                .count();
    }

//4 Írj egy függvényt, ami paraméterként egy ember listát vár és visszatér egy string listával, ami az emberek nevét tartalmazza.
    public List<String> emberekNevei(List<Ember> emberList){
        return emberList.stream()
                .map(Ember::getNev)
                .collect(Collectors.toList());
    }

//5 Írj egy függvényt, ami paraméterként egy ember listát vár
// és visszatér ugyanazzal az ember listával, de mindenki legyen egy évvel idősebb.
    public List<Ember> egyEvvelIdosebb(List<Ember> emberList){
        return emberList.stream()
//                .peek(ember -> ember.setKor(ember.getKor() + 1))
                .map(ember -> new Ember(ember.getNev(),ember.getKor() + 1, ember.isFerfi(),ember.getPenz()))
                .collect(Collectors.toList());
    }

//6 Írj egy függvényt, ami paraméterként két ember listát vár és visszatér a két lista összefűzött változatával.
// Amennyiben valaki (név alapján) mindkét listában benne van, akkor az eredmény listában csak egyszer szerepeljen.
    public  List<Ember> ketListaOsszefuzese(List<Ember> emberList, List<Ember> emberList1){
//        return (List<Ember>) Stream.of(emberList, emberList1)
//                .flatMap(List::stream)
//                .collect(Collectors.toMap(Ember::getNev,
//                        d -> d,
//                        (Ember x, Ember y) -> x))
//                .values();

        return Stream.of(emberList, emberList1)
                .flatMap(Collection::stream)
                .filter(distinctByKey(Ember::getNev))
                .collect(Collectors.toList());
}

    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}
