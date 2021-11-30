package fr.lernejo;

import fr.lernejo.Sample;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @org.junit.jupiter.api.Test
    void op() {
        Sample s = new Sample();
        assertEquals(s.op(Sample.Operation.ADD, 3, 3), 6);
        assertEquals(s.op(Sample.Operation.MULT, 3, 3), 9);
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Sample s = new Sample();
        assertThrows(IllegalArgumentException.class, () -> s.fact(-1));
        assertEquals(s.fact(3), 6);
    }
}
