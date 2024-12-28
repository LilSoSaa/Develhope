package Testing.Testing4;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class FormatDataTest {

    @Test
    void getAnno() {
        assertEquals(2023, FormatData.getAnno("2023-03-01T13:00:00Z"));
    }

    @Test
    void getMese() {
        assertEquals(3, FormatData.getMese("2023-03-01T13:00:00Z"));
    }

    @Test
    void getGiorno() {
        assertEquals(1, FormatData.getGiorno("2023-03-01T13:00:00Z"));
    }

    @Test
    void getGiornoSettimana() {
        assertEquals(DayOfWeek.WEDNESDAY, FormatData.getGiornoSettimana("2023-03-01T13:00:00Z"));
    }
}