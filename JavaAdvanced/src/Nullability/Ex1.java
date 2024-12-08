package Nullability;
/*Scrivere una funzione che accetti un array in input e provi a dividere
un numero dell'array per 0 e gestisca sia l'eccezione della divisione che
 quella di indice non presente nell'array, leggendone il messaggio.
 Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */
public class Ex1 {
    public static void main(String[] args) {
        try{
            System.out.println("Result: " + divisione(9.0, 2.0));
            System.out.println("Result: " + divisione(null, 2.0));
            System.out.println("Result: " + divisione(9.0, null));
        } catch (Exception e) {
            System.out.println("Errore: " + e);
        }

    }

    public static double divisione (Double numeratore, Double denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("Numeratore o denominatore non possono essere nulli");
        }

        return (double) numeratore / denominatore;

    }
}
