package ClassiAstratte;
/*Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.
 */
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(12.76,4.7);
        Triangolo triangolo = new Triangolo(34.12,41.4);

        System.out.println("Area del triangolo: " + triangolo.calcoloArea());
        System.out.println("Area del rettangolo: " + rettangolo.calcoloArea());


    }
}
