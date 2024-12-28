package Testing.Testing2;

import org.junit.jupiter.api.Test;

import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class FormatDateTest {

    @Test
    void testFormattaDataShort() {
        String result = FormatDate.formattaData("2002-03-01T13:00:00Z", "Europe/Rome", FormatStyle.SHORT, Locale.ITALIAN);
        assertEquals("01/03/02, 14:00", result, "Il formato SHORT non corrisponde");
    }

    @Test
    void testFormattaDataMedium() {
        String result = FormatDate.formattaData("2002-03-01T13:00:00Z", "Europe/Rome", FormatStyle.MEDIUM, Locale.ITALIAN);
        assertEquals("1 mar 2002, 14:00:00", result, "Il formato MEDIUM non corrisponde");
    }

    @Test
    void testFormattaDataFull() {
        String result = FormatDate.formattaData("2002-03-01T13:00:00Z", "Europe/Rome", FormatStyle.FULL, Locale.ITALIAN);
        assertEquals("venerdì 1 marzo 2002 14:00:00 Ora standard dell’Europa centrale", result, "Il formato FULL non corrisponde");
    }
}