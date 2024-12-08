package Exceptions;
/*Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
 */
public class Ex1 {
    public static void main(String[] args) {
        int a = 12;

        try {
            if (a <= 0 || a > 10) {
                throw new Exception("Il numero non rispetta il range");
            }
            System.out.println("Il numero rispetta il range");

        } catch(Exception e) {
            System.out.println(e);
        }

    }
}
