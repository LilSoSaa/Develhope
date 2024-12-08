package HashSet.Ex1;

import java.util.HashSet;
import java.util.Set;

/*Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi
 */
public class Ex1 {
    public static void main(String[] args) {

        Set<String> auto = new HashSet<>();
        auto.add("Nissan");
        auto.add("Audi");
        auto.add("BMW");
        auto.add("Lexus");

        System.out.println("Grandezza dellHashSet = " + auto.size());
        System.out.println("Elementi all'internto dell'HAshSet: ");
        for (String car : auto) {
            System.out.println(car);
        }
    }
}
