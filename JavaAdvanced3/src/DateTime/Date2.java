package DateTime;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
 */
public class Date2 {
    public static void main(String[] args) {
        OffsetDateTime obj = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy", Locale.ITALIAN);

        //formattimo data

        String dataFormattata = obj.format(dateTimeFormatter);

        System.out.println(dataFormattata);

    }
}
