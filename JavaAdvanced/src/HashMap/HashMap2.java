package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, String> capitali = new HashMap<>();

        capitali.put("Inghilterra", "Londra");
        capitali.put("Italia", "Roma");
        capitali.put("Spagna", "Madrid");
        capitali.put("Portogallo", "Lisbona");
        capitali.put("Grecia", "Atene");
        capitali.put("Olanda", "Amsterdam");

       // Coll
        ArrayList<String> valori = new ArrayList<>(capitali.values());
        Collections.sort(valori);

        System.out.println(valori);

    }
}
