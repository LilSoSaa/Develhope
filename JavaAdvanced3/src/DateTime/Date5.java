package DateTime;

import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato
 */
public class Date5 {
    public static void main(String[] args) {
        OffsetDateTime obj = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime obj2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime currentDate = OffsetDateTime.now();

        if (obj.equals(currentDate) && obj2.equals(currentDate)) {
            System.out.println("Le date sono uguali alla data odierna");
        }

        if (obj.equals(obj2)) {
            System.out.println("Le date sono uguali");
        } else if (obj.isBefore(obj2)){
            System.out.println("La prima data è prima della seconda");
        } else if (obj2.isAfter(obj)) {
            System.out.println("La seconda data è dopo la prima");
        }
    }
}
