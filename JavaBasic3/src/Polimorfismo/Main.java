package Polimorfismo;

import Ereditarieta.Ex2.Forma;
import Ereditarieta.Ex2.Rettangolo;

/*A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
 aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 */
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(4, 7);
        Triangolo triangolo = new Triangolo(5,8);

        forma.calcoloArea();
        rettangolo.calcoloArea();
        triangolo.calcoloArea();
    }
}
