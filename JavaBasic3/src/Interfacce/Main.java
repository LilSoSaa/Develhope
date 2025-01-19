package Interfacce;
/*Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.

 */
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(6,9);
        Triangolo triangolo = new Triangolo(14,5);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
