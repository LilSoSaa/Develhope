package Testing.Testing1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();
    @Test
    void sommaNumeri() {
        Integer result = testing.sommaNumeri(1, 4);
        assertEquals(5, result, "Somma di a e b dovrebbe essere 5");
    }
}