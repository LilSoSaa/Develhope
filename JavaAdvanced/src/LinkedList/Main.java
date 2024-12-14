package LinkedList;

import java.util.LinkedList;

/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */
public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Mela");
        Fruit fruit2 = new Fruit("Pera");
        Fruit fruit3 = new Fruit("Kiwi");

        LinkedList<Fruit> frutti = new LinkedList<>();

        frutti.add(fruit1);
        frutti.add(fruit2);
        frutti.add(fruit3);

        System.out.println("Lista iniziale: ");
        for (Fruit frutto : frutti) {
            System.out.println(frutto.getName());
        }

        frutti.addFirst(new Fruit("Banana"));
        frutti.addLast(new Fruit("Anguria"));

        System.out.println("\nLista Aggiornata: ");
        for (Fruit frutto : frutti) {
            System.out.println(frutto.getName());
        }
    }
}
