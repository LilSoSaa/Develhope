package Testing.Testing3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {
    public static String formattaData(String data) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        return offsetDateTime.format(formatter);
    }
}
