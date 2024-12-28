package Testing.Testing5;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
Crea dei test per questo esercizio
 */
public class Main {
    public static void main(String[] args) {
        OffsetDateTime obj = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        obj = obj.plusYears(1);
        obj = obj.minusMonths(1);
        obj = obj.plusDays(7);

        ZonedDateTime zonedDateTime = obj.toZonedDateTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.getDefault());

        System.out.println(dateTimeFormatter.format(zonedDateTime));
    }
}
