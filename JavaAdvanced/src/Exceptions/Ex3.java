package Exceptions;
//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio
public class Ex3 {
    public static void main(String[] args) {

        try {
            System.out.println(dividerePer0(5));
        } catch (ArithmeticException e) {
            System.out.println("Impossibile dividere per 0");
        }
    }

    public static double dividerePer0 (int a) {
        return a / 0;
    }
}
