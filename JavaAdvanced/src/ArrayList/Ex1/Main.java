package ArrayList.Ex1;

import java.util.ArrayList;
import java.util.List;

/*Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

 */
public class Main {
    public static void main(String[] args) {

        List<Studente> studenti = new ArrayList<>();

        Studente studente1 = new Studente("Mauro", 23);
        Studente studente2 = new Studente("Maria", 21);
        Studente studente3 = new Studente("Giulia", 18);
        Studente studente4 = new Studente("Lello", 45);

        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);

        for (Studente student : studenti) {
            System.out.println(student);
        }
    }
}
