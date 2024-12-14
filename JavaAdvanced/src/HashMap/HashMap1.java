package HashMap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class HashMap1 {
    public static void main(String[] args) {

        //1°
        HashMap<String, String> capitali = new HashMap<>();

        capitali.put("Inghilterra", "Londra");
        capitali.put("Italia", "Roma");

        //2°
        Map<String, String> capitali2 = new HashMap<String, String>(Map.of("Inghilterra", "Londra", "Italia", "Roma"));

        //3°
        Map<String, String> capitali3 = new HashMap<String, String>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("Inghilterra", "Londra"),
                 new AbstractMap.SimpleEntry<String, String>("Italia", "Roma")));


        System.out.println(capitali);
        System.out.println(capitali2);
        System.out.println(capitali3);
    }
}
