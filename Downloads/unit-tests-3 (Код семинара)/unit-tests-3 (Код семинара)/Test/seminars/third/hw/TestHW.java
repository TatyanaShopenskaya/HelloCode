package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestHW {

    MainHW number;

    @BeforeEach
    void setUp() {
        number = new MainHW(0);
    }

    @Test
    void evenNumber() {
        assertTrue(number.evenNumber(100));
    }

    @Test
    void notEvenNumber() {
        assertFalse(number.evenNumber(77));
    }

    @Test
    void inInterval() {
        assertTrue(number.interval(40));
    }

    @Test
    void notInInterval() {
        assertFalse(number.interval(10));
    }
}