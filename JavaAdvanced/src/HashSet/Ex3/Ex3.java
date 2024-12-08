package HashSet.Ex3;

import java.util.HashSet;
import java.util.Set;

/*Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
 */
public class Ex3 {
    public static void main(String[] args) {

        HashSet<String> auto = creaHashSet();

        System.out.println("Elementi  iniziali dell'HashSet: " + auto);

        //Aggiungo duplicato
        String doppione = "BMW";
        auto.add(doppione);
        System.out.println("HashSet dopo aver aggiunto il duplicato: " + auto);


        for (String car : auto) {
            if (car.equals(doppione)) {
                System.out.println("L'auto " + car +" è uguale al doppione: " + doppione);
                auto.remove(doppione);
                break;
            }
        }

        System.out.println("HashSet Finale con doppione rimosso: " + auto);


        //Svuoto completamente HashSet
        auto.clear();
        System.out.println("HashSet svuotato: " + auto);

    }

    public static HashSet<String> creaHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Audi");
        hashSet.add("BMW");
        hashSet.add("Lexus");
        hashSet.add("Nissan");

        return hashSet;
    }

}
