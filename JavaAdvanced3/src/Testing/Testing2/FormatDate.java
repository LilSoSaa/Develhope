package Testing.Testing2;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDate {

    public static String formattaData(String data, String zoneIdStr, FormatStyle formatStyle, Locale locale) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

        ZoneId zoneId = ZoneId.of(zoneIdStr);
        ZonedDateTime zonedDateTime = offsetDateTime.atZoneSameInstant(zoneId);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(formatStyle).withLocale(locale);
        return zonedDateTime.format(dateTimeFormatter);
    }
}
