package Testing.Testing5;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDate {
    public static String modificaData(String data) {
        OffsetDateTime obj = OffsetDateTime.parse(data);

        // Modifica della data
        obj = obj.plusYears(1);
        obj = obj.minusMonths(1);
        obj = obj.plusDays(7);

        // Formattazione localizzata per l'Italia
        ZonedDateTime zonedDateTime = obj.toZonedDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                .withLocale(Locale.ITALIAN);

        return formatter.format(zonedDateTime);
    }
}
