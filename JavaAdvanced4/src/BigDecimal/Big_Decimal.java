package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
Crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
 */
public class Big_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inserisco primo numero
        System.out.println("Inserisci 1' numero con la virgola: ");
        BigDecimal num1 = new BigDecimal(scanner.nextLine());

        //inserisco secondo numero
        System.out.println("Inserisci 2' numero con la virgola: ");
        BigDecimal num2 = new BigDecimal(scanner.nextLine());

        //far scegliere operazione dall'utente
        System.out.println("Scegli operazione: (+) (-) (*) (/) (min) ( max)");
        String operazioneInput = scanner.nextLine().toLowerCase().trim();

        //definiamo l'operazione che vogliamo dal valueof dell'enum corrispondente a quello messo da tastiera
        Operazioni operazione = Operazioni.daSimbolo(operazioneInput);

        // Calcoliamo il risultato
        BigDecimal result = null;

        // Ciclo finché la divisione non è valida
        while (true) {
            try {
                result = operazione.calcola(num1, num2);
                break; // Se l'operazione va a buon fine, esci dal ciclo
            } catch (ArithmeticException e) {
                System.out.println("Errore: " + e.getMessage() + ". Inserisci un altro numero per evitare la divisione per zero.");
                // Chiedo di nuovo il secondo numero
                System.out.println("Inserisci 2' numero con la virgola: ");
                num2 = new BigDecimal(scanner.nextLine());

                System.out.println("");
            }
        }

        BigDecimal resultArrotondato = result.setScale(2, RoundingMode.HALF_DOWN);


        System.out.println("Operazione: " + operazione);
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Risultato Originario: " + result);
        System.out.println("Risultato Arrotondato per difetto con solo due numeri decimali: " + resultArrotondato);

    }
}
