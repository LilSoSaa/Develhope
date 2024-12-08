package HashSet.Ex2;

import java.util.HashSet;
import java.util.Set;

/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */
public class Ex2 {
    public static void main(String[] args) {
        Set<String> auto = creareHashset();


            if (auto.contains("Nissan")) {
                System.out.println("L'elemento fa parte dell'HashSet");
            } else {
                System.out.println("L'elemento non è presente nell'HashSet");
            }
        }



    public static Set<String> creareHashset() {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Audi");
        hashSet.add("BMW");
        hashSet.add("Lexus");
        hashSet.add("Nissan");

        return hashSet;
    }
}
