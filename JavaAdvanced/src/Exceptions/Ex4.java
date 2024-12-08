package Exceptions;
/*Scrivere una funzione che accetti un array in input e provi a dividere
un numero dell'array per 0 e gestisca sia l'eccezione della divisione che
 quella di indice non presente nell'array, leggendone il messaggio.
 Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] numeri = {34, 12, 5, 21, 9};


        dividiArray(numeri);

    }

    public static void dividiArray (int[] numeri) {

        try {
            System.out.println("Numero dell'Array: " + numeri[1] + " diviso per 0");
            int result = numeri[1] / 0;
        } catch (ArithmeticException e) {
            System.out.println("nOn si può dividere per 0");
        }

        try {
            System.out.println("Cerchiamo di accedere ad un indice al di fuori dell'Array");
            int element = numeri[6];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice al di fuori dell'Array");
        }
    }
}
