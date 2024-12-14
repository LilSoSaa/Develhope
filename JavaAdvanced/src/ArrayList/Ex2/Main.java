package ArrayList.Ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {

        List<Studente> studenti = new ArrayList<>();

        Studente studente1 = new Studente("Mauro", 23);
        Studente studente2 = new Studente("Maria", 21);
        Studente studente3 = new Studente("Giulia", 18);
        Studente studente4 = new Studente("Luca", 25);
        Studente studente5 = new Studente("Marco", 20);
        Studente studente6 = new Studente("Marco", 19);
        Studente studente7 = new Studente("Elisa", 22);
        Studente studente8 = new Studente("Marco", 24);
        Studente studente9 = new Studente("Chiara", 20);
        Studente studente10 = new Studente("Davide", 27);
        Studente studente11 = new Studente("Francesca", 23);
        Studente studente12 = new Studente("Stefano", 26);

        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);
        studenti.add(studente5);
        studenti.add(studente6);
        studenti.add(studente7);
        studenti.add(studente8);
        studenti.add(studente9);
        studenti.add(studente10);
        studenti.add(studente11);
        studenti.add(studente12);

        System.out.println("Ordine iniziale: ");
        for (Studente student : studenti) {
            System.out.println(student);
        }

        //Ordiniamo per Nome ed età
        studenti.sort(Comparator.comparing(Studente::getName).thenComparingInt(Studente::getAge));

        System.out.println("\nOrdiniamo in base al Nome ed Età: ");
        for (Studente student : studenti) {
            System.out.println(student);
        }
    }
}
