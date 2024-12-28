package Testing.Testing2;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
-Crea dei test per questo esercizio
 */
public class Main {
    public static void main(String[] args) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        ZoneId zoneId = ZoneId.of("Europe/Rome");
        ZonedDateTime zonedDateTime = offsetDateTime.atZoneSameInstant(zoneId);

        DateTimeFormatter _full = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ITALIAN);
        DateTimeFormatter _medium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ITALIAN);
        DateTimeFormatter _short = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.ITALIAN);

        String fullFormat = _full.format(zonedDateTime);
        String mediumFormat = _medium.format(zonedDateTime);
        String shortFormat = _short.format(zonedDateTime);

        System.out.println(fullFormat);
        System.out.println(mediumFormat);
        System.out.println(shortFormat);

    }
}
