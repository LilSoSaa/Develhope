package Testing.Testing3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatDateTest {

    @Test
    void testFormattaData() {
        String risultato = FormatDate.formattaData("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", risultato, "La data formattata non corrisponde");

    }

    void testFormattaDataConAltroInput() {
        String risultato = FormatDate.formattaData("2000-01-01T00:00:00Z");
        assertEquals("17 gennaio 1974", risultato, "La data formattata non corrisponde per un altro input");
    }

}