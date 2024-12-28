package DateTime;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */
public class Date1 {
    public static void main(String[] args) {

        OffsetDateTime obj = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime zonedDateTime = obj.toZonedDateTime();

        DateTimeFormatter dateTimeFormatterFULL = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ITALIAN);
        DateTimeFormatter dateTimeFormatterMEDIUM = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ITALIAN);
        DateTimeFormatter dateTimeFormatterSHORT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.ITALIAN);

        String fullFormat = dateTimeFormatterFULL.format(zonedDateTime);
        String mediumFormat = dateTimeFormatterMEDIUM.format(zonedDateTime);
        String shortFormat = dateTimeFormatterSHORT.format(zonedDateTime);

        System.out.println(fullFormat);
        System.out.println(mediumFormat);
        System.out.println(shortFormat);
    }
}
